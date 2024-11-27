package org.example.carina.demo;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

public class TiendaNubeButtonTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @MethodOwner(owner = "qpsdemo")
    public void testCreateStoreButtonPresence() {
        // Inicializa el WebDriver desde Carina
        WebDriver driver = getDriver();

        try {
            LOGGER.info("Abriendo Tienda Nube...");
            String url = "https://www.tiendanube.com";
            driver.get(url);

            // Busca el boton
            By buttonSelector = By.xpath("//a[contains(text(),'Crear tienda gratis')]");
            WebElement button = driver.findElement(buttonSelector);

            // Verifica si el boton esta visible
            Assert.assertTrue(button.isDisplayed(), "El botón 'Crear tienda gratis' no está visible en la pagina.");

            LOGGER.info("El botón 'Crear tienda gratis' esta presente y visible.");
        } catch (Exception e) {
            LOGGER.error("Error al buscar el boton en la pagina: ", e);
            Assert.fail("El test fallo debido a una excepcion.");
        } finally {
            // Cierra el navegador
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
