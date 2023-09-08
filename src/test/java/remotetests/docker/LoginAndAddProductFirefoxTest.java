package remotetests.docker;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import selenidepage.LoginAndAddProductPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class LoginAndAddProductFirefoxTest {

    @Description("Login to the application and add product to wish list")
    @Test
    public void loginAndAddProductToWishList() {

        Configuration.browser = "firefox";
        Configuration.timeout = 20000;

        Configuration.remote = "http://localhost:4444/wd/hub";

        open("https://mejuri.com/world/en#");

        String productNameToCheck = "Honey Mini Signet";
        LoginAndAddProductPage page = new LoginAndAddProductPage();


        // Login to the application
        page.LoginIcon.click();
        page.Email.setValue(utility.ConfigurationReader.getUsername());
        page.Password.setValue(utility.ConfigurationReader.getPassword());
        page.ContinueButton.click();
        // Add Honey Mini to wish list
        page.SearchIcon.shouldBe(Condition.visible).click();
        page.SearchBoxField.setValue("Honey Mini Signet").pressEnter();
        page.ProductName.click();
        page.clickOnWishListButton();
        // Assert product exist in wish list cart
        page.AddToWishList();
        page.ProductInWishListCart.shouldHave(text(productNameToCheck));
        // Sign out from the application
        page.ElementToHover.hover();
        page.SignOut.click();

        System.out.println("Running in docker container...............");

    }
}
