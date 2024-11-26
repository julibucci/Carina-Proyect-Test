package org.example.carina.demo.gui.components.footer;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import org.example.carina.demo.gui.pages.common.HomePageBase;
import org.example.carina.demo.gui.pages.common.NewsPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

public abstract class FooterMenuBase extends AbstractUIObject {

    public FooterMenuBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract NewsPageBase openNewsPage();

    public abstract HomePageBase openHomePage();
}
