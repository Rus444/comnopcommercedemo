package NopCommercePOM;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _currencySelector=By.id("customerCurrency");
    private By _euroCurrencyOption=By.xpath("//*[@id='customerCurrency']/option[2]");
    private By _firstItemPriceOnHomePage=By.xpath("//div[2]/div[1]/div/div[2]/div[3]/div[1]/span");
    private By _secondItemPriceOnHomePage=By.xpath("//div[2]/div/div[2]/div[3]/div[1]/span");
    private By _thirdItemPriceOnHomePage=By.xpath("//div[3]/div/div[2]/div[3]/div[1]/span");
    private By _fourthItemPriceOnHomePage=By.xpath("//div[4]/div/div[2]/div[3]/div[1]/span");

    public void selectCurrencyFromDropdown(){
        clickElement(_currencySelector);
        //selectElementByIndex(_euroCurrencyOption,1);
        clickElement(_euroCurrencyOption);
    }

    public void getCurrencySign(){

    }
}
