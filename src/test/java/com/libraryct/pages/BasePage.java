package com.libraryct.pages;

import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

        @FindBy(xpath = "//span[@class='title']")
        public List<WebElement> menuOptions;

        @FindBy(css="a.navbar-brand")
        public WebElement pageSubTitle;

        @FindBy(linkText = "Log Out")
        public WebElement logOutLink;

        public BasePage() {
            PageFactory.initElements(Driver.get(), this);
        }


        /**
         * @return page name, for example: Dashboard
         */
        public String getPageSubTitle() {
            return pageSubTitle.getText();
        }


        /**
         * Waits until loader screen present. If loader screen will not pop up at all,
         * NoSuchElementException will be handled  bu try/catch block
         * Thus, we can continue in any case.
         */


}
