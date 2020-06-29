package com.mesj.app.pageobject;

import org.openqa.selenium.By;

public class SignUpPageObject {
    private By firstnameTextbox = By.xpath("//input[@ng-model='FirstName']");
    private By lastnameTextbox = By.xpath("//input[@ng-model='LastName']");
    private By addressTextarea = By.xpath("//textarea[@ng-model='Adress']");
    private By emailTextbox = By.xpath("//input{@ng-model='EmailAdress'}");
    private By phoneTextbox = By.xpath("//input{@ng-model='Phone'}");


}
