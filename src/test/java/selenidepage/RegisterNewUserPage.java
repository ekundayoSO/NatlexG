package selenidepage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterNewUserPage {
    public SelenideElement cookies = $(By.id("onetrust-accept-btn-handler"));
    public SelenideElement registerIcon = $(By.xpath("(//button[@data-testid='nav-dp-l1-user-navigation-signup'])[1]"));
    public SelenideElement registerLinkText = $(By.xpath("(//a[@data-testid='onboarding-footer-link'])[1]"));
    public SelenideElement emailField = $(By.id("input-email"));
    public SelenideElement nameField = $(By.id("input-name"));
    public SelenideElement passwordField = $(By.id("input-newPassword"));
    public SelenideElement termsAndConditions = $(By.cssSelector(".ePbyHq"));
    public SelenideElement SignUpButton = $(By.cssSelector(".jusxzI"));

}
