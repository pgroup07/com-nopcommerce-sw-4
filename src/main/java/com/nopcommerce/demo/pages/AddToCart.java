package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddToCart extends Utility {
    By addCard = By.xpath("(//*[@class='button-2 product-box-add-to-cart-button'])[1]");

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addCard);

    }
}
