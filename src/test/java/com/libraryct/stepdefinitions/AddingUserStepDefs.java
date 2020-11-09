package com.libraryct.stepdefinitions;

import com.libraryct.pages.UserManagementPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddingUserStepDefs {


    @Then("the user should click Add Users button")
    public void the_user_should_click_Add_Users_button() {

        UserManagementPage userManagementPage =  new UserManagementPage();
        Assert.assertTrue(userManagementPage.addUserButton.isDisplayed());
        userManagementPage.addUserButton.click();

    }

    @Then("the user should click Close button")
    public void the_user_should_click_Close_button() {
        UserManagementPage userManagementPage =  new UserManagementPage();
        Assert.assertTrue(userManagementPage.closeButton.isDisplayed());
        userManagementPage.closeButton.click();

    }

    @Then("the user should click Edit User button")
    public void the_user_should_click_Edit_User_button() {
        UserManagementPage userManagementPage =  new UserManagementPage();
        Assert.assertTrue(userManagementPage.editUserButton.isDisplayed());
        userManagementPage.editUserButton.click();


    }



}
