package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutOpcPayment_Method extends Utility {
    By selectRadioButton = By.xpath("//input[@id='paymentmethod_1']");
By clickOnContinueButton=By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    /**
     * This method use for Select Card type
     */
    public void selectRadio() {
        selectCheckBox(selectRadioButton);
    }

    /**
     * This method use for continue button
     */
    public void clickOnContinue(){
        clickOnElement(clickOnContinueButton);
    }


}
