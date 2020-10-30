package com.libraryct.stepdefinitions;

import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class LoginStepDefs {
    @When("the user logs in as {String}")
    public void the_user_logs_in_as(String role) {
        Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username =null;
        String password =null;

        if(role.equals("student")){
            username = ConfigurationReader.get("student_username");
            password = ConfigurationReader.get("student_password");
        }else if(role.equals("student2")){
            username = ConfigurationReader.get("student2_username");
            password = ConfigurationReader.get("student2_password");
        }else if(role.equals("student3")){
            username = ConfigurationReader.get("student3_username");
            password = ConfigurationReader.get("student3_password");
        }else if(role.equals("librarian")){
            username = ConfigurationReader.get("librarian_username");
            password = ConfigurationReader.get("librarian_password");
        }
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys(username);
        loginPage.passWord.sendKeys(password + Keys.ENTER);
        BrowserUtils.waitFor(1);

    }

    @Then("user on {string}")
    public void user_on(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
