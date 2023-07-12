package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CellPhones cellPhones = new CellPhones();
    NokiaLumia1020 nokiaLumia1020 = new NokiaLumia1020();
    ElectronicCart electronicCart = new ElectronicCart();
    ElectronicsRegisterCart electronicsRegisterCart = new ElectronicsRegisterCart();
    ElectronicRegisterShoppingCart electronicRegisterShoppingCart = new ElectronicRegisterShoppingCart();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        homePage.clickOnElectronic();
        electronicsPage.mouseHoverOnElectronics();
        Thread.sleep(1000);
        electronicsPage.mouseHoverCellPhone();
        String expectedText = "Cell phones";
        String actualText = cellPhones.verifyCellPhone();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        homePage.clickOnElectronic();
        electronicsPage.mouseHoverOnElectronics();
        electronicsPage.mouseHoverCellPhone();
        String expectedText = "Cell phones";
        String actualText = cellPhones.verifyCellPhone();
        Assert.assertEquals(actualText, expectedText);
        cellPhones.listView();
        cellPhones.nokiaLumia1020();
        String expectedNokia = "Nokia Lumia 1020";
        String actualNokia = nokiaLumia1020.verifyNokiaLumia1020();
        Assert.assertEquals(actualNokia, expectedNokia);
        String expectedNokiaPrice = "$349.00";
        String actualNokiaPrice = nokiaLumia1020.verifyNokiaPrice();
        Assert.assertEquals(actualNokiaPrice, expectedNokiaPrice);
        nokiaLumia1020.updateQuantity();
        nokiaLumia1020.clickOnUpdateCart();
        String expectedBar = "The product has been added to your shopping cart";
        String actualNokiaBar = nokiaLumia1020.verifyShoppingCart();
        Assert.assertEquals(actualNokiaBar, expectedBar);
        nokiaLumia1020.closeBarNotification();
        nokiaLumia1020.clickShoppingCart();

        String expected = "Shopping cart";
        String actual = electronicCart.verifyShoppingCart();
        Assert.assertEquals(actual, expected);

        String expectedQty = "2";
        String actualQty = electronicCart.verifyQty();
        Assert.assertEquals(actualQty, expectedQty);

        String expectedPrice = "$698.00";
        String actualPrice = electronicCart.verifyTotal();
        Assert.assertEquals(actualPrice, expectedPrice);
        electronicCart.clickOnCheckBox();
        electronicCart.clickOnCheckOut();
        String expectedWellCome = "Welcome, Please Sign In!";
        String actualWellCome = electronicsRegisterCart.verifyWellCome();
        Assert.assertEquals(actualWellCome, expectedWellCome);
        electronicsRegisterCart.clickOnRegister();

        String expectedRegister = "Register";
        String actualRegister = electronicsRegisterCart.verifyRegister();
        Assert.assertEquals(actualRegister, expectedRegister);

        electronicsRegisterCart.enterFirstName("Admin");
        electronicsRegisterCart.enterLastName("123");
        electronicsRegisterCart.enterEmail("Admin12@gmail.com");
        electronicsRegisterCart.enterPassword("Admin@123");
        electronicsRegisterCart.enterConfirmPassword("Admin@123");
        electronicsRegisterCart.register();

        String expectedRegisterCompleted = "Your registration completed";
        String actualRegisterCompleted = electronicsRegisterCart.registrationCompleted();
        Assert.assertEquals(actualRegisterCompleted, expectedRegisterCompleted);

        String expectedCart = "Shopping cart";
        String actualCart = electronicRegisterShoppingCart.shoppingCartText();
        Assert.assertEquals(actualCart, expectedCart);


    }
}
