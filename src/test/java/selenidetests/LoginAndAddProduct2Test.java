package selenidetests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import selenidepage.LoginAndAddProductPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class LoginAndAddProduct2Test {

    @Description("Login to the application and add product to wish list")
    @Test
    public void loginAndAddProductToWishList() throws InterruptedException {

        Configuration.timeout = 10000;
        Configuration.remote = "http://127.0.0.1:58785/wd/hub";

        open("https://mejuri.com/world/en#");

        String productNameToCheck = "Honey Mini Signet";
        LoginAndAddProductPage page = new LoginAndAddProductPage();

        // Accept cookies
        page.Cookies.click();
        // Login to the application
        page.LoginIcon.click();
        page.Email.setValue(utility.ConfigurationReader.getUsername());
        page.Password.setValue(utility.ConfigurationReader.getPassword());
        page.ContinueButton.click();
        // Add Honey Mini to wish list
        page.SearchIcon.shouldBe(Condition.visible).click();
        page.SearchBoxField.setValue("Honey Mini Signet").pressEnter();
        page.ProductName.click();
        page.WishListButton.click();
        // Assert product exist in wish list cart
        page.WishListCart.click();
        Thread.sleep(2000);
        page.ProductInWishListCart.shouldHave(text(productNameToCheck));
        // Sign out from the application
        page.ElementToHover.hover();
        page.SignOut.click();

        System.out.println("Running on k8........................");

    }
}
