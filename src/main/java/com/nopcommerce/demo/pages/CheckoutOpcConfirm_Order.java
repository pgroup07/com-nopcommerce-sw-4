package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutOpcConfirm_Order extends Utility {
    By verifyCreditCard = By.xpath("//span[normalize-space()='Credit Card']");
    By verifyShipping = By.xpath("//span[normalize-space()='Next Day Air']");
    By verifyTotalPrice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By clickOnConfirmButton = By.xpath("//button[normalize-space()='Confirm']");
    By verifyThankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    By verifyYourOrderText = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By clickOnContinueButton = By.xpath("//button[normalize-space()='Continue']");
    By verifyWelcomeToOurStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");

    /**
     * This method use for Verify the Payment Method
     *
     * @return
     */
    public String verifyPaymentMethod() {
        return getTextFromElement(verifyCreditCard);
    }

    /**
     * This method use for Verify the Shipping type
     *
     * @return
     */
    public String verifyShippingType() {
        return getTextFromElement(verifyShipping);
    }

    /**
     * This method use for Verify the Total price
     *
     * @return
     */
    public String verifyTotal() {
        return getTextFromElement(verifyTotalPrice);
    }

    /**
     * This method use for click on Confirm button
     */
    public void clickOnConfirm() {
        clickOnElement(clickOnConfirmButton);
    }

    /**
     * This method use for Verify "Thank You" Text
     * @return
     */
    public String verifyThankYou() {
        return getTextFromElement(verifyThankYouText);
    }

    /**
     * This method use for Verify the  "Order has been Successfully Processed"
     * @return
     */
    public String verifyYourOrderHasBeenSuccessfullyProcessed() {
        return getTextFromElement(verifyYourOrderText);
    }

    /**
     * This method use for click on Continue
     */
    public void clickOnContinue() {
        clickOnElement(clickOnContinueButton);
    }

    /**
     *  This method use for Verify the "Welcome to our store" Text
     * @return
     */
    public String verifyWelcomeToOurStore() {
        return getTextFromElement(verifyWelcomeToOurStoreText);
    }


}
