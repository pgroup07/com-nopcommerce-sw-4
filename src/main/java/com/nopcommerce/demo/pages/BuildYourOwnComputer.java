package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By verifyBuildComputer = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectDualCoreE2200 = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By selectHDD = By.xpath("//input[@id='product_attribute_3_7']");
    By selectOS = By.xpath("//input[@id='product_attribute_4_9']");
    By selectSoftware = By.xpath("//*[@id='product_attribute_5_10']");
    By selectSoftware1 = By.xpath("//*[@id='product_attribute_5_12']");

    By verifyPriceOfOwnComputer = By.xpath("//span[@id='price-value-1']");
    By clickOnAddToCartOwnComputer = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyProductAddedInCart = By.xpath("(//p[@class='content'])[1]");
    By ClickingCrossButton = By.xpath("//span[@title='Close']");
    By clickOnGOToCartButton = By.xpath("//span[@class='cart-label']");


    /**
     * This method use to verify the Own computer Text
     *
     * @return
     */
    public String VerifyBuildYourOwnComputerText() {
        return getTextFromElement(verifyBuildComputer);

    }

    /**
     * This method use to select the Processor
     */

    public void selectProcessor(String option) {
        selectByVisibleTextFromDropDown(selectDualCoreE2200, option);
    }

    /**
     * This method use to select the RAM
     */

    public void selectRam(String option) {
        selectByVisibleTextFromDropDown(selectRam, option);
    }

    /**
     * This method use to select the HDD
     */

    public void selectHDD() {
        clickOnElement(selectHDD);
    }

    /**
     * This method use to select the OS
     */

    public void selectOS() {
        clickOnElement(selectOS);
    }

    /**
     * This method use to select the Software
     */

    public void selectSoftware() {
        selectCheckBox(selectSoftware);
        selectCheckBox(selectSoftware1);
    }

    /**
     * This method use to verify the price "$1,475.00"
     *
     * @return
     */

    public String verifyPrice() {
        return getTextFromElement(verifyPriceOfOwnComputer);
    }

    /**
     * This method use to add in Cart
     */
    public void clickOnAddToCart() {
        clickOnElement(clickOnAddToCartOwnComputer);
    }

    /**
     * This method use to verify Message "The product has been added to your shopping cart" on Top
     *
     * @return
     */
    public String verifyProductAddedCart() {
        return getTextFromElement(verifyProductAddedInCart);
    }

    /**
     * This method use to clicking on the cross button.
     */
    public void barClickingCrossButton() {
        clickOnElement(ClickingCrossButton);
    }

    /**
     * This method use to clicking on the "GO TO CART" button.
     */
    public void clickOnGoToCart1() {
        clickOnElement(clickOnGOToCartButton);
    }

}
