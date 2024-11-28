package org.example.carina.demo;

import com.zebrunner.carina.core.IAbstractTest;

import org.example.carina.demo.mobile.gui.pages.AccountPage;
import org.example.carina.demo.mobile.gui.pages.HomePage;
import org.example.carina.demo.mobile.gui.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;
import static org.testng.Assert.assertTrue;

public class NavigationTest implements IAbstractTest {
    @Test
    public void testLoginAndNavigate() {
        // Instanciar HomePage y abrirla
        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        // Ir a la página de inicio de sesión
        LoginPage loginPage = homePage.clickLogin();

        // Iniciar sesión y navegar a la página de cuenta
        AccountPage accountPage = loginPage.login("testuserCarina@example.com", "x@vbnm3is@ZdSSA");;

        // Validar que estamos en la página de cuenta
        assertTrue(accountPage.isPageOpened(), "La página de cuenta no se abrió correctamente.");

        // Cerrar sesión y regresar a HomePage
        accountPage.clickLogout();
    }
}