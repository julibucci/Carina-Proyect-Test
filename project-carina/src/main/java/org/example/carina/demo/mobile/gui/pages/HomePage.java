package org.example.carina.demo.mobile.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.login")
    private ExtendedWebElement loginButton;

    public LoginPage clickLogin() {
        loginButton.click();
        return new LoginPage(getDriver());
    }
}