package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsRegisterCart extends Utility {
    By verifyWellComeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By clickOnRegisterTab = By.xpath("//button[normalize-space()='Register']");
    By verifyRegisterText = By.xpath("//h1[normalize-space()='Register']");
    By firstname = By.xpath("//input[@id='FirstName']");
    By lastname = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By RegisterButton = By.xpath("//button[@id='register-button']");
    By yourRegistrationCompleted = By.xpath("//div[@class='result']");

    /**
     * This method use for Verify the Text
     *
     * @return
     */
    public String verifyWellCome() {
        return getTextFromElement(verifyWellComeText);
    }

    /**
     * This method use for Click on Register Tab
     */
    public void clickOnRegister() {
        clickOnElement(clickOnRegisterTab);
    }

    /**
     * This method use for Verify the Text
     *
     * @return
     */
    public String verifyRegister() {
        return getTextFromElement(verifyRegisterText);
    }

    public void enterFirstName(String option) {
        sendTextToElement(firstname, option);
    }

    public void enterLastName(String option) {
        sendTextToElement(lastname, option);
    }

    public void enterEmail(String option) {
        sendTextToElement(email, option);
    }

    public void enterPassword(String option) {
        sendTextToElement(password, option);
    }

    public void enterConfirmPassword(String option) {
        sendTextToElement(confirmPassword, option);
    }

    public void register() {
        clickOnElement(RegisterButton);
    }

    public String registrationCompleted() {
        return getTextFromElement(yourRegistrationCompleted);
    }

}
