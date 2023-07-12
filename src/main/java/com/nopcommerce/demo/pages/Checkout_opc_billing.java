package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Checkout_opc_billing extends Utility {
    By FirstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By LastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By EmailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By SelectCountryOptions = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By SelectState_provinceOption = By.id("BillingNewAddress_StateProvinceId");
    By SelectCityOption = By.xpath("//input[@id='BillingNewAddress_City']");
    By SelectAddressOption = By.xpath("//input[@id='BillingNewAddress_Address1']");

    By SendZip_PostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By ClickOnContinueButton = By.xpath("//button[@onclick='Billing.save()']");
    By EnterPhoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");













    /**
     * This method use Enter First name
     *
     * @param option
     */
    public void FirstName(String option) {
        sendTextToElement(FirstNameField, option);
    }

    /**
     * This method use Enter Last name
     *
     * @param option
     */
    public void LastName(String option) {
        sendTextToElement(LastNameField, option);
    }

    /**
     * This method use Enter Email
     *
     * @param option
     */
    public void EmailAddress(String option) {
        sendTextToElement(EmailField, option);
    }

    /**
     * This method use Select Country
     *
     * @param option
     */
    public void SelectCountry(String option) {
        sendTextToElement(SelectCountryOptions, option);
    }

    /**
     * This method use Select State/province
     *
     * @param option
     */
    public void SelectState_province(String option) {
        sendTextToElement(SelectState_provinceOption, option);
    }

    /**
     * This method use Select City
     *
     * @param option
     */
    public void SelectCity(String option) {
        sendTextToElement(SelectCityOption, option);
    }

    /**
     * This method use Select Address
     *
     * @param option
     */

    public void SelectAddress(String option) {
        sendTextToElement(SelectAddressOption, option);
    }

    public void SelectZip_PostalCode(String option) {
        sendTextToElement(SendZip_PostalCode, option);
    }



    public void EnterPhoneNumber(String option) {
        sendTextToElement(EnterPhoneNumberField, option);
    }
    public void ClickOnContinue() {
        clickOnElement(ClickOnContinueButton);
    }


}
