package org.example.carina.demo;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

public class TiendaNubeTitleTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @MethodOwner(owner = "qpsdemo")
    public void testPageTitle() {
        // Inicializa el WebDriver desde Carina
        WebDriver driver = getDriver();

        try {
            // Abre la URL de Tienda Nube
            LOGGER.info("Abriendo Tienda Nube...");
            String url = "https://www.tiendanube.com";
            driver.get(url);

            // Obtiene el titulo de la pagina
            String actualTitle = driver.getTitle();
            LOGGER.info("El título obtenido es: " + actualTitle);

            // Titulo esperado
            String expectedTitle = "Creá tu tienda online y comenzá a vender hoy";

            // Verifica que el titulo es el esperado
            Assert.assertEquals(actualTitle, expectedTitle, "El titulo de la pagina no coincide con lo esperado.");
        } finally {
            // Cierra el navegador
            if (driver != null) {
                driver.quit();
            }
        }
    }
}

