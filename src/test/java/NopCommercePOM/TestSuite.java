package NopCommercePOM;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage=new HomePage();

    @Test
    public void iSelectEuroCurrencyOnHomePage(){
        homePage.selectCurrencyFromDropdown();
    }

    @Test
    public void iSortHighToLowOnClothingPage(){

    }
}
