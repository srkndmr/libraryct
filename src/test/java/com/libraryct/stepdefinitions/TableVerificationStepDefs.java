package com.libraryct.stepdefinitions;

import com.libraryct.pages.BookManagementPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class TableVerificationStepDefs {

    BookManagementPage bookManagementPage = new BookManagementPage();


    @Then("user should be able to see the current URL {string}")
    public void user_should_be_able_to_see_the_current_URL(String expectedURL) {
        String actualURL = Driver.get().getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains(expectedURL));
    }

    @Then("User should be able to see the column names")
    public void user_should_be_able_to_see_the_column_names(List<String> expectedColumnName) {
        List<String> actualColumnNames = BrowserUtils.getElementsText(bookManagementPage.columnNames);
        Assert.assertEquals(actualColumnNames, expectedColumnName);

    }
}


