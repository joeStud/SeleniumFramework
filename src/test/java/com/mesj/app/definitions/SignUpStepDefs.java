package com.mesj.app.definitions;

import com.mesj.app.pageobject.SignUpPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpStepDefs {

    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() {
        //System.setProperty("webdriver.chrome.driver",
          //      System.getProperty("user.dir") + "src/test/resources/drivers/windows/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\software\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //se instancias y se pasa el objeto
        SignUpPageObject signUpPageObject = new SignUpPageObject(driver);
        signUpPageObject.go("http://demo.automationtesting.in/Register.html");
        signUpPageObject.writeFirstName("Joel");
        signUpPageObject.writeLastName("Leiva");
        signUpPageObject.clickOnSubmit();
    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("he should be told that the account was created")
    public void he_should_be_told_that_the_account_was_created() {

    }


}
