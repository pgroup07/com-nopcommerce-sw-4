package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    By sortPosition = By.xpath("//select[@id='products-orderby']");

    /**
     *
     * @param option
     */
    public void sortByPosition(String option) {
        selectByVisibleTextFromDropDown(sortPosition, option);

    }
}
