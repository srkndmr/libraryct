package com.libraryct.stepdefinitions;

import com.libraryct.pages.UserManagementPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddingUserStepDefs {

    @Then("the user should click {string}")
    public void the_user_should_click(String string) {

        UserManagementPage userManagementPage =  new UserManagementPage();
        userManagementPage.addUserButton.click();

    //deneme

    }



}
