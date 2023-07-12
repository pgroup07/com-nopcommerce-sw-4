package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerCart extends Utility {

    By clickOnShoppingCartOption=By.xpath("//button[normalize-space()='Go to cart']");
    By verifyShoppingCartMsg = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By clearBeforeQtyInCart = By.xpath("//input[contains(@id,'itemquantity')]");
    By clearAfterQtyInCart = By.xpath("//input[contains(@id,'itemquantity')]");
    By updateShoppingCartProduct = By.xpath("//button[@id='updatecart']");
    By verifyShoppingCartTotalPrice = By.xpath("//span[@class='product-subtotal']");
    By clickOnCheckBoxOption = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckOutButton = By.xpath("//button[@id='checkout']");

    By verifyWelComeMessage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By clickOnCheckOutAsGuestButton = By.xpath("//button[normalize-space()='Checkout as Guest']");


    public void clickOnShoppingCart(){
        mouseHoverToElementAndClick(clickOnShoppingCartOption);
    }



    /**
     * This method use to Verify the message "Shopping cart"
     *
     * @return
     */
    public String verifyShoppingCart() {
        return getTextFromElement(verifyShoppingCartMsg);
    }

    /**
     *
     */
    public void clearBeforeQty() {

    }

    /**
     * This method Change the Qty to "2" and Click on "Update shopping cart"
     *
     * @param option
     */
    public void changeQty(String option) {
        sendTextToElement(clearAfterQtyInCart, option);
    }

    /**
     * This method Update shopping cart after change Qty
     */
    public void updateShoppingCart() {
        clickOnElement(updateShoppingCartProduct);
    }

    /**
     * This method use to Verify the message Total
     *
     * @return
     */
    public String verifyShoppingCartTotal() {
        return getTextFromElement(verifyShoppingCartTotalPrice);
    }

    /**
     * This method use to click on checkbox “I agree with the terms of service”
     */
    public void clickOnCheckBox() {
        clickOnElement(clickOnCheckBoxOption);
    }

    /**
     * This method use to Click on “CHECKOUT”
     */
    public void clickOnCheckOut() {
        clickOnElement(clickOnCheckOutButton);
    }

    /**
     * This method use to Verify the Text “Welcome, Please Sign In!”
     *
     * @return
     */
    public String verifyWelComeText() {
        return getTextFromElement(verifyWelComeMessage);
    }

    /**
     * This method use Click on “CHECKOUT AS GUEST” Tab
     */
    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckOutAsGuestButton);
    }




}
