package org.example.carina.demo.mobile.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);

    }

    // Locator para el botón "Sign in"
    @FindBy(css = "a.login")
    private ExtendedWebElement loginButton;

    // Método para hacer clic en el botón "Sign in" y navegar a LoginPage
    public LoginPage clickLogin() {
        loginButton.click();
        return new LoginPage(getDriver());
    }
}