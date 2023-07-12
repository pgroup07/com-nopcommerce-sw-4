package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicCart extends Utility {

    By shoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By verifyQtyItem = By.xpath("//input[@id='itemquantity11229']");
    By verifyTotalPrice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By clickCheckBox = By.xpath("//input[@id='termsofservice']");
    By clickCheckOut = By.xpath("//button[@id='checkout']");


    /**
     * This method use for Verify the Text
     *
     * @return
     */
    public String verifyShoppingCart() {
        return getTextFromElement(shoppingCart);
    }

    /**
     * This method use for Verify the Quantity
     *
     * @return
     */
    public String verifyQty() {
        return getTextFromElement(verifyQtyItem);
    }

    /**
     * This method use for Verify the Total Price
     *
     * @return
     */
    public String verifyTotal() {
        return getTextFromElement(verifyTotalPrice);
    }

    /**
     * This method use for Click on check box
     */
    public void clickOnCheckBox() {
        clickOnElement(clickCheckBox);
    }

    /**
     * This method use for Click on checkout button
     */
    public void clickOnCheckOut() {
        clickOnElement(clickCheckOut);
    }

}
