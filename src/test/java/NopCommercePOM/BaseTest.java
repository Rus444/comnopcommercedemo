package NopCommercePOM;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    BrowserSelector browserSelector=new BrowserSelector();

    @BeforeMethod
    public void setUp(){
        browserSelector.setUpBrowser();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            Utils.takeAScreenshotWhenTestFails(driver, result.getName());
        }
        //driver.quit();
    }
}