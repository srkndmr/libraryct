package com.libraryct.pages;

import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (id = "inputEmail")
    public WebElement userName;

    @FindBy (id = "inputPassword")
    public WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy (xpath = "//img[@id='user_avatar']")
    public WebElement user;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement logout;


    public void login(String username, String password) {
        userName.sendKeys(username);
        BrowserUtils.waitFor(1);
        passWord.sendKeys(password);
        submit.click();
        BrowserUtils.waitFor(1);
        // verification that we logged
    }

    public void logout(){
        user.click();
        logout.click();
    }
}
