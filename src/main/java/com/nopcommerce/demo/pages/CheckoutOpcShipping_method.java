package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutOpcShipping_method extends Utility {
    By clickOnRadioButton = By.xpath("//input[@id='shippingoption_1']");
By ClickOnContinueButton=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public void clickOnRadio() {
        clickOnElement(clickOnRadioButton);
    }

    public void clickOnContinue() {
        clickOnElement(ClickOnContinueButton);
    }

}
