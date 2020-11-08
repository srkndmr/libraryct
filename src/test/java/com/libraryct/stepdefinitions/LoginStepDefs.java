package com.libraryct.stepdefinitions;

import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefs {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("{string} enters valid credentials")
    public void enters_valid_credentials(String user) {
        String username = null;
        String password = null;

       if(user.equals("student")){
            username = ConfigurationReader.get("student_username");
            password = ConfigurationReader.get("student_password");
        }else if(user.equals("student2")){
            username = ConfigurationReader.get("student2_username");
            password = ConfigurationReader.get("student2_password");
        }else if(user.equals("student3")){
            username = ConfigurationReader.get("student3_username");
            password = ConfigurationReader.get("student3_password");
        }else if(user.equals("librarian")){
            username = ConfigurationReader.get("librarian_username");
            password = ConfigurationReader.get("librarian_password");
        }
        new LoginPage().login(username,password);

    }

    @Then("user should be able to see {string}")
    public void user_should_be_able_to_see(String title) {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(title));
        System.out.println(Driver.get().getCurrentUrl());
    }
    @When("user logs out")
    public void user_logs_out() {
        LoginPage loginPage= new LoginPage();
        loginPage.logout();
    }

    @Then("the current url should be {string}")
    public void the_current_url_should_be(String url) {
        Assert.assertEquals(url,Driver.get().getCurrentUrl());
    }

    @When("the User login as {string}")
    public void the_User_login_as(String user) {
        String username = null;
        String password = null;

        if(user.equals("student")){
            username = ConfigurationReader.get("student_username");
            password = ConfigurationReader.get("student_password");
        }else if(user.equals("student2")){
            username = ConfigurationReader.get("student2_username");
            password = ConfigurationReader.get("student2_password");
        }else if(user.equals("student3")){
            username = ConfigurationReader.get("student3_username");
            password = ConfigurationReader.get("student3_password");
        }else if(user.equals("librarian")){
            username = ConfigurationReader.get("librarian_username");
            password = ConfigurationReader.get("librarian_password");
        }else if (user.equals("noMailWithPass ")){
            username = "";
            password = "abc123";
        }else if (user.equals("validMailWithPass")){
            username = "azerefem@gmail.com";
            password = "abc123";
        }else if (user.equals("validMailNoPass")){
            username = "azerefem@gmail.com";
            password = "";
        }else if (user.equals("inValidMailWithPass")){
            username = "azerAgmail.com";
            password = "abc123";
        }else if (user.equals("inValidMailNoPass")){
            username = "azerAgmail.com";
            password = "";
        }
        new LoginPage().login(username,password);
    }

    @Then("the User lands on {string}")
    public void the_User_lands_on(String landingPage) {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(landingPage));
        System.out.println(Driver.get().getCurrentUrl());
    }

    @Then("the User should see the error {string}")
    public void the_User_should_see_the_error(String errorMessage) {
        BrowserUtils.waitFor(3);
        String actualErrorMessage = new LoginPage().errorMessage.getText();
        Assert.assertEquals("verify error",errorMessage,actualErrorMessage);

    }



}