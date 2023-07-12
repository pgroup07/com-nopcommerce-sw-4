package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    By ComputerTab = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");

    public void clickOnDesktop() {
        clickOnElement(ComputerTab);
    }
}
