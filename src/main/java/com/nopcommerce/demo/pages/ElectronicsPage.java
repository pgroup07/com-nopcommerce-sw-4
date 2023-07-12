package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By mouseHoverOnElectronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By mouseHoverCellPhoneOption = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    /**
     * This method use to mouse Hover on Tab
     */
    public void mouseHoverOnElectronics() {
        mouseHoverToElement(mouseHoverOnElectronicsTab);
    }

    /**
     *  This method use to mouse Hover on Tab and click on options
     */
    public void mouseHoverCellPhone() {
        mouseHoverToElementAndClick(mouseHoverCellPhoneOption);
    }


}
