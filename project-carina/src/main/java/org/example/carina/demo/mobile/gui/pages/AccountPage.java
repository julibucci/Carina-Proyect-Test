package org.example.carina.demo.mobile.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(css = "a.logout")
    private ExtendedWebElement logoutButton;

    public HomePage clickLogout() {
        logoutButton.click();
        return new HomePage(getDriver());
    }

    @Override
    public boolean isPageOpened() {
        return logoutButton.isElementPresent();
    }
}