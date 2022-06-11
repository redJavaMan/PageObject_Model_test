package test;

import base.Base;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckOutPage;
import pages.IphonePage;
import pages.PhonesListPage;

public class CartTest extends Base {
    @Test
    public void testCart(){
        PhonesListPage phonesListPage=homePage.clickPhonesMenu();
        phonesListPage.clickPhone();
        IphonePage iphonePage = phonesListPage.clickPhone();
        iphonePage.iphoneCart();
        iphonePage.clickItem();
        CartPage cartPage = iphonePage.viewCart();
        cartPage.getTxtChkOut();
        CheckOutPage checkOutPage = cartPage.clickCheckOut();
        checkOutPage.getAlertMessage();






    }


}
