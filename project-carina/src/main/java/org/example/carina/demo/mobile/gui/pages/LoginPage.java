package org.example.carina.demo.mobile.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private ExtendedWebElement emailInput;

    @FindBy(id = "passwd")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private ExtendedWebElement submitLoginButton;

    public AccountPage login(String email, String password) {
        emailInput.type(email);
        passwordInput.type(password);
        submitLoginButton.click();
        return new AccountPage(getDriver());
    }
}
