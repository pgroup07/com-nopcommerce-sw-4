package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By computerTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By electronicTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");

    public void clickOnComputer() {
        clickOnElement(computerTab);

    }

    public void clickOnElectronic() {
        mouseHoverToElementAndClick(electronicTab);
    }
}
