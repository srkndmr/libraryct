package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {

    public UserManagementPage ()
    { PageFactory.initElements(Driver.get(), this);   }

    @FindBy (css = "#tbl_users_info")
    public WebElement recordsInfoText;

    @FindBy (xpath = "//select [@ name ='tbl_users_length']")
    public WebElement recordOptions;

    @FindBy (css = ".portlet-title>span")
    public WebElement addUserButton;

    @FindBy (xpath = "//*[@id=\"tbl_users\"]/tbody/tr[1]/td[1]/a")
    public WebElement editUserButton;






}
