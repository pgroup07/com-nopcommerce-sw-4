package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutOpcPayment_Info extends Utility {
    By selectMasterCardOption = By.xpath("//select[@id='CreditCardType']");
    By enterCardholderNameField = By.xpath("//input[@id='CardholderName']");
    By enterCardNumberField = By.xpath("//input[@id='CardNumber']");
    By selectMonthOption = By.xpath("//select[@id='ExpireMonth']");
    By selectYearOption = By.xpath("//select[@id='ExpireYear']");
    By selectCardCodeOption = By.xpath("//input[@id='CardCode']");
    By clickOnContinueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");


    /**
     * This method use for select Card type
     *
     * @param option
     */
    public void selectMasterCard(String option) {
        selectByVisibleTextFromDropDown(selectMasterCardOption, option);
    }

    /**
     * This method use for Enter Cardholder name
     *
     * @param option
     */
    public void enterCardholderName(String option) {
        selectByVisibleTextFromDropDown(enterCardholderNameField, option);
    }

    /**
     * This method use for Enter Card Number
     *
     * @param option
     */
    public void enterCardNumber(String option) {
        selectByVisibleTextFromDropDown(enterCardNumberField, option);
    }

    public void selectMonthExpiration(String option) {
        selectByVisibleTextFromDropDown(selectMonthOption, option);
    }

    public void selectYearExpiration(String option) {
        selectByVisibleTextFromDropDown(selectYearOption, option);
    }

    public void selectCardCode(String option) {
        selectByVisibleTextFromDropDown(selectCardCodeOption, option);
    }

    public void clickOnContinue() {
        clickOnElement(clickOnContinueButton);
    }

}
