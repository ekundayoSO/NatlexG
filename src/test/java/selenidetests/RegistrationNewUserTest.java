package selenidetests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import selenidepage.RegisterNewUserPage;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationNewUserTest {

    @Description("Creating a new user account")
    @Test
    public void registrationTest() {

        Configuration.timeout = 20000;
        open("https://mejuri.com/world/en#");
        RegisterNewUserPage page = new RegisterNewUserPage();

        page.cookies.click();
        page.registerIcon.click();
        page.registerLinkText.click();
        page.emailField.setValue(utility.ConfigurationReader.getUsername());
        page.nameField.setValue(utility.ConfigurationReader.getFullName());
        page.passwordField.setValue(utility.ConfigurationReader.getPassword());
        page.termsAndConditions.click();
        page.SignUpButton.click();

   }
}
