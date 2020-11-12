package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;
import java.util.List;

public class BookManagementPage {

    public BookManagementPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//th")
    public List<WebElement> columnNames;

    @FindBy(xpath = "//*[@id=\"books\"]/div[1]/div[1]/h3")
    public WebElement title;



}
