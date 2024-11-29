package org.example.carina.demo;

import com.zebrunner.carina.core.IAbstractTest;
import org.example.carina.demo.mobile.gui.pages.AccountPage;
import org.example.carina.demo.mobile.gui.pages.HomePage;
import org.example.carina.demo.mobile.gui.pages.LoginPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class NavigationTest implements IAbstractTest {
    @Test
    public void testLoginAndNavigate() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        LoginPage loginPage = homePage.clickLogin();

        AccountPage accountPage = loginPage.login("testuserCarina@example.com", "x@vbnm3is@ZdSSA");;

        assertTrue(accountPage.isPageOpened(), "The account page did not open correctly.");

        accountPage.clickLogout();
    }
}