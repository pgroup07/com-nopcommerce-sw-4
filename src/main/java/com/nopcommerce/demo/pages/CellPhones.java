package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhones extends Utility {
    By verifyCellPhoneText = By.xpath("//h1[normalize-space()='Cell phones']");

    By listViewOption = By.xpath("//a[normalize-space()='List']");
    By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    /**
     * This method is use to verify text "Cell Phone"
     *
     * @return
     */
    public String verifyCellPhone() {
        return getTextFromElement(verifyCellPhoneText);
    }

    public void listView() {
        clickOnElement(listViewOption);
    }

    public void nokiaLumia1020() {
        clickOnElement(nokiaLumia1020);
    }

}
