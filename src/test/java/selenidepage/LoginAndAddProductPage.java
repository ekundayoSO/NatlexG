package selenidepage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import static com.codeborne.selenide.Selenide.$;

public class LoginAndAddProductPage {

    public SelenideElement Cookies = $(By.id("onetrust-accept-btn-handler"));
    public SelenideElement LoginIcon = $(By.xpath("(//button[@aria-label='Login'])[1]"));
    public SelenideElement Email = $(By.id("input-email"));
    public SelenideElement Password = $(By.id("input-password"));
    public SelenideElement ContinueButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement SearchIcon = $(By.xpath("(//li/button[@aria-label='Search'])[1]"));
    public SelenideElement SearchBoxField = $(By.xpath("(//input[@data-h='main-search-input'])[1]"));
    public SelenideElement ProductName = $(By.xpath("//h6[contains(text(),'Honey Signet')]"));
    public SelenideElement WishListButton = $(By.xpath("//i[@data-testid='icon-whishlist-btn']"));
    public SelenideElement WishListCart = $(By.xpath("(//i[@data-testid='empty'])[1]"));
    public SelenideElement ProductInWishListCart = $(By.xpath("//span[contains(text(),'Honey Mini Signet')]"));
    public SelenideElement ElementToHover = $(By.xpath("(//button[@aria-label='User'])[1]"));
    public SelenideElement SignOut = $(By.xpath("(//span[contains(text(),'Sign Out')])[1]"));

    // Actions

    public void clickOnWishListButton() {

        try {
            WishListButton.click();
        } catch (TimeoutException e) {
            System.out.println("Timeout waiting for element: " + e.getMessage());
        }

    }

    public void AddToWishList() {

        try {
            WishListCart.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        }

    }

    }



