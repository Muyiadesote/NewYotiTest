package TestCases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.buyDressPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by musti on 19/06/2017.
 */
public class buyDressTest extends base {

    @Test
    public void buyDress() throws InterruptedException, IOException {
        LoginPage lp = new LoginPage(driver);
        lp.doLogin("olu.adesote@yahoo.co.uk", "Muyi123");

        buyDressPage bdp = new buyDressPage(driver);
        bdp.AddDress2Cart();
        System.out.println(driver.getTitle());

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP\\FirstAutomationProject\\YotiTest\\src\\main\\java\\Screenshots\\BuyDress.jpg"));
        driver.close();
    }
}
