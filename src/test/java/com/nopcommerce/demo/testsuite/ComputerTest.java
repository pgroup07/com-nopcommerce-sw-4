package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ComputersPage computersPage = new ComputersPage();
    AddToCart addToCart = new AddToCart();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ComputerCart cart = new ComputerCart();
    Checkout_opc_billing onePageCheckoutOpcBilling = new Checkout_opc_billing();
    CheckoutOpcShipping_method onePageCheckoutOpcShippingMethod = new CheckoutOpcShipping_method();
    CheckoutOpcPayment_Method onePageCheckoutOpcPaymentMethod = new CheckoutOpcPayment_Method();
    CheckoutOpcPayment_Info onePageCheckoutOpcPaymentInfo = new CheckoutOpcPayment_Info();
    CheckoutOpcConfirm_Order onePageCheckoutOpcConfirmOrder = new CheckoutOpcConfirm_Order();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        homePage.clickOnComputer();
        computersPage.clickOnDesktop();
        desktopsPage.sortByPosition("Name: Z to A");
        addToCart.addToCart();


    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputer();
        computersPage.clickOnDesktop();
        desktopsPage.sortByPosition("Name: A to Z");
        addToCart.addToCart();
        Thread.sleep(1000);
        String expectedMessage = "Build your own computer";
        String actualMessage = buildYourOwnComputer.VerifyBuildYourOwnComputerText();
        Assert.assertEquals(actualMessage, expectedMessage);
        buildYourOwnComputer.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputer.selectRam("8GB [+$60.00]");
        Thread.sleep(1000);
        buildYourOwnComputer.selectHDD();
        buildYourOwnComputer.selectOS();
        buildYourOwnComputer.selectSoftware();
        Thread.sleep(2000);
        String expectedPrice = "$1,475.00";
        String actualPrice = buildYourOwnComputer.verifyPrice();
        Assert.assertEquals(actualPrice, expectedPrice);
        Thread.sleep(1000);
        buildYourOwnComputer.clickOnAddToCart();
        String expectedProductCart = "The product has been added to your shopping cart";
        String actualProductCart = buildYourOwnComputer.verifyProductAddedCart();
        Assert.assertEquals(actualProductCart, expectedProductCart);
        buildYourOwnComputer.barClickingCrossButton();

        cart.clickOnShoppingCart();
        String expected = "Shopping cart";
        String actual =  cart.verifyShoppingCart();
        Assert.assertEquals(actual, expected);




        cart.changeQty("2");
        cart.updateShoppingCart();

        String expectedPrice1 = "$2,950.00";
        String actualPrice1 = cart.verifyShoppingCartTotal();
        Assert.assertEquals(actualPrice1, expectedPrice1);
        cart.clickOnCheckBox();
        cart.clickOnCheckOut();
        String expectedTx = "Welcome, Please Sign In!";
        String actualTx = cart.verifyWelComeText();
        Assert.assertEquals(actualTx, expectedTx);

        cart.clickOnCheckOutAsGuest();
        onePageCheckoutOpcBilling.FirstName("Admin");
        onePageCheckoutOpcBilling.LastName("123");
        onePageCheckoutOpcBilling.EmailAddress("Admin123@gmail.com");
        onePageCheckoutOpcBilling.SelectCountry("United States");
        onePageCheckoutOpcBilling.SelectState_province("Alabama");
        onePageCheckoutOpcBilling.SelectCity("New York");
        onePageCheckoutOpcBilling.SelectAddress("Lal Street");
        onePageCheckoutOpcBilling.SelectZip_PostalCode("326598");
        onePageCheckoutOpcBilling.ClickOnContinue();
        onePageCheckoutOpcBilling.EnterPhoneNumber("9876543210");
        onePageCheckoutOpcBilling.ClickOnContinue();
        onePageCheckoutOpcShippingMethod.clickOnRadio();
        onePageCheckoutOpcShippingMethod.clickOnContinue();

        onePageCheckoutOpcPaymentMethod.selectRadio();
        onePageCheckoutOpcPaymentMethod.clickOnContinue();
        onePageCheckoutOpcPaymentInfo.selectMasterCard("Master card");
        onePageCheckoutOpcPaymentInfo.enterCardholderName("Admin");
        onePageCheckoutOpcPaymentInfo.enterCardNumber("5573615091331588");
        onePageCheckoutOpcPaymentInfo.selectMonthExpiration("04");
        onePageCheckoutOpcPaymentInfo.selectYearExpiration("2024");
        onePageCheckoutOpcPaymentInfo.selectCardCode("436");
        onePageCheckoutOpcPaymentInfo.clickOnContinue();
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = onePageCheckoutOpcConfirmOrder.verifyPaymentMethod();
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod);
        String expectedShippingMethod = "Next Day Air";
        String actualShippingMethod = onePageCheckoutOpcConfirmOrder.verifyShippingType();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod);
        String expectedTotal = "$2,950.00";
        String actualTotal = onePageCheckoutOpcConfirmOrder.verifyTotal();
        Assert.assertEquals(actualTotal, expectedTotal);
        onePageCheckoutOpcConfirmOrder.clickOnConfirm();
        String expectedText = "Thank you";
        String actualText = onePageCheckoutOpcConfirmOrder.verifyThankYou();
        Assert.assertEquals(actualText, expectedText);

        String expectedText1 = "Your order has been successfully processed!";
        String actualText1 = onePageCheckoutOpcConfirmOrder.verifyYourOrderHasBeenSuccessfullyProcessed();
        Assert.assertEquals(actualText1, expectedText1);
        onePageCheckoutOpcConfirmOrder.clickOnContinue();

        String expectedText2 = "Welcome to our store";
        String actualText2 = onePageCheckoutOpcConfirmOrder.verifyWelcomeToOurStore();
        Assert.assertEquals(actualText2, expectedText2);
    }


}
