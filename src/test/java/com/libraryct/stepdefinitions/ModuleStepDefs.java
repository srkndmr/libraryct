package com.libraryct.stepdefinitions;

import com.libraryct.pages.ModulePage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ModuleStepDefs {


    @Then("As a librarian, I should be able to see following module options once login.")
    public void as_a_librarian_I_should_be_able_to_see_following_module_options_once_login(List<String> menuOpt) {

        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new ModulePage().menuOptions);
        Assert.assertEquals(menuOpt,actualOptions);
        System.out.println("menuOptions = " + menuOpt);
        System.out.println("actualOptions = " + actualOptions);
    }

    @Then("As a student, I should be able to see following module options once login.")
    public void as_a_student_I_should_be_able_to_see_following_module_options_once_login(List<String> menuOpt) {

        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new ModulePage().menuOptions);
        Assert.assertEquals(menuOpt,actualOptions);
        System.out.println("menuOptions = " + menuOpt);
        System.out.println("actualOptions = " + actualOptions);
    }



}
