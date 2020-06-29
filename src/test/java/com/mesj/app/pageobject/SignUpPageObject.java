package com.mesj.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageObject {

    private WebDriver driver;

    //consttructor (se le conoce como una dependencia porque tiene que pasarle el object driver
    public SignUpPageObject(WebDriver driver){
        this.driver=driver;
    }

    public void go(String url){
        this.driver.get(url);
    }

    private By firstnameTextbox = By.xpath("//input[@ng-model='FirstName']");
    private By lastnameTextbox = By.xpath("//input[@ng-model='LastName']");
    // private By addressTextarea = By.xpath("//textarea[@ng-model='Adress']");
    private By emailTextbox = By.xpath("//input[@ng-model='EmailAdress']");
    private By phoneTextbox = By.xpath("//input[@ng-model='Phone']");
    private By generoMale = By.xpath("//input[@value='Male']");
    private By generoFemale = By.xpath("//input[@value='FeMale']");
    private By country = By.id("countries");
    private By dateOfBirthYear = By.id("yearbox");
    private By dateOfBirthMonth = By.xpath("//select[@ng-model='monthbox']");
    private By dateOfBirthDay = By.id("daybox");
    private By password = By.id("firstpassword");
    private By confirmPassword = By.id("secondpassword");
    private By submit = By.id("submitbtn");

    public void writeFirstName(String firstname){
        //voy a decirle que me busque a este elemento
        this.driver.findElement(this.firstnameTextbox).sendKeys(firstname);
    }
    public void writeLastName(String lastname){
        this.driver.findElement(this.lastnameTextbox).sendKeys(lastname);
    }
    public void writeEmail(String email){
        this.driver.findElement(this.emailTextbox).sendKeys(email);
    }
    public void writePhone(String phone){
        this.driver.findElement(this.phoneTextbox).sendKeys(phone);
    }
    public void selectMale(){
        this.driver.findElement(this.generoMale).click();
    }
    public void selectFamale(){
        this.driver.findElement(this.generoFemale).click();
    }
    public void selectCountry(String country){
        new Select(this.driver.findElement(this.country)).selectByValue(country);
    }
    public void selectBirtDay(String day){
        new Select(this.driver.findElement(this.dateOfBirthDay)).selectByValue(day);
    }
    public void selectBirtMonth(String month){
        new Select(this.driver.findElement(this.dateOfBirthMonth)).selectByValue(month);
    }
    public void selectBirtYear(String year){
        new Select(this.driver.findElement(this.dateOfBirthYear)).selectByValue(year);
    }
    public void writePassword(String password){
        this.driver.findElement(this.password).sendKeys(password);
    }
    public void writeConfirmPassword(String copassword){
        this.driver.findElement(this.password).sendKeys(copassword);
    }

    public void clickOnSubmit(){
        this.driver.findElement(this.submit).click();
    }






}
