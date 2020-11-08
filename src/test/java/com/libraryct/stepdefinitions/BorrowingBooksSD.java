package com.libraryct.stepdefinitions;

import com.libraryct.pages.BorrowingBooksPage;
import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class BorrowingBooksSD {

    @Given("The student logged in")
    public void the_student_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login(ConfigurationReader.get("student_username"),ConfigurationReader.get("student_password"));

    }

    @And("The student on Borrowing Books Page")
    public void the_student_on_Borrowing_Books_Page() {
        new BorrowingBooksPage().BorrowingBooks.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Borrowed Books table should have following column names:")
    public void borrowed_Books_table_should_have_following_column_names(List<String>Headers) {
        List<String> actualHeaders = BrowserUtils.getElementsText(new BorrowingBooksPage().BorrowedHeaders);
        Assert.assertEquals(Headers,actualHeaders);
    }

    //deneme

}
