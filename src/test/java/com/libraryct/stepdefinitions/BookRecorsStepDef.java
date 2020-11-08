package com.libraryct.stepdefinitions;

import com.libraryct.pages.LoginPage;
import com.libraryct.pages.UserManagementPage;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class BookRecorsStepDef {



    @When("the user navigate to  Users page")
    public void the_user_navigate_to_Users_page() {
        new LoginPage().Users.click();

    }

    @Then("As default {int} records")
    public void as_default_records(Integer int1) {
        String message = "Showing 1 to "+int1+" of";
        UserManagementPage userManagementPage =  new UserManagementPage();
        BrowserUtils.waitForVisibility(userManagementPage.recordsInfoText,2);
        Assert.assertTrue("The deafult needs to be 10 in mesaage",userManagementPage.recordsInfoText.getText().contains(message));
    }

    @Then("Show records for {int} options")
    public void show_records_for_options(Integer option) {  // i tried to change the parameter type to string but it gave error so i used wrapper class
        UserManagementPage userManagementPage = new UserManagementPage();
        Select select= new Select(userManagementPage.recordOptions);
        select.selectByVisibleText(String.valueOf(option));  // here i used wrapper class to pass the parameter into select method
        BrowserUtils.waitFor(1);            //when i change this  wait with any dinamic wait type all options giving error at the assertion (only deafult one -10 is passing)
        String value= String.valueOf(option);
        String message = "Showing 1 to "+value+" of";  // i changed the assertion expected text to dynamic for each option
        Assert.assertTrue("option number needs to be in the text",userManagementPage.recordsInfoText.getText().contains(message));

    }


}
