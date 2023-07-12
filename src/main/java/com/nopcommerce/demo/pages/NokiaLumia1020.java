package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020 extends Utility {

    By verifyNokiaLumia1020Text = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By verifyNokiaPriceText = By.xpath("//span[@id='price-value-20']");

    By clearQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By updateCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By shoppingCart = By.xpath("//p[@class='content']");
    By closeBar = By.xpath("//span[@title='Close']");
    By goToShoppingCart = By.xpath("//span[@class='cart-label']");


    /**
     * This method use for Verify Text
     * @return
     */
    public String verifyNokiaLumia1020() {
        return getTextFromElement(verifyNokiaLumia1020Text);
    }

    /**
     * This method use for Verify Price Text
     * @return
     */
    public String verifyNokiaPrice() {
        return getTextFromElement(verifyNokiaPriceText);
    }

    /**
     *  This method use for change and update Quantity
     */
    public void updateQuantity() {
        driver.findElement(clearQuantity).clear();
        sendTextToElement(addQuantity, "2");
    }

    /**
     * This method use for Update cart
     */
    public void clickOnUpdateCart() {
        clickOnElement(updateCart);
    }

    /**
     * This method use for Verify Text Shopping cart
     * @return
     */
    public String verifyShoppingCart() {
        return getTextFromElement(shoppingCart);
    }

    /**
     * This method use for Close the Bar Notification
     */
    public void closeBarNotification() {
        clickOnElement(closeBar);
    }

    /**
     * This method use for Click on Shopping Cart
     */
    public void clickShoppingCart() {
        mouseHoverToElementAndClick(goToShoppingCart);
    }


}
