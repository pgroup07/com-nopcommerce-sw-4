package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicRegisterShoppingCart extends Utility {
    By shoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");

    public String shoppingCartText() {
        return getTextFromElement(shoppingCart);
    }
}
