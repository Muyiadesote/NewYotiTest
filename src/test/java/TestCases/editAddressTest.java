package TestCases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.editAddressPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by musti on 19/06/2017.
 */
public class editAddressTest extends base {

    @Test
    public void editAddress() throws InterruptedException, IOException {
        LoginPage lp = new LoginPage(driver);
        lp.doLogin("olu.adesote@yahoo.co.uk", "Muyi123");

        editAddressPage eap = new editAddressPage(driver);
        eap.editAddress();

        Thread.sleep(5000);
        eap.enterAdd("91 Adesote Street");

        eap.selOption("New Jersey");

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP\\FirstAutomationProject\\YotiTest\\src\\main\\java\\Screenshots\\EAddress1.jpg"));
        eap.SaveNewAddr();
        File srcFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile1, new File("C:\\WIP\\FirstAutomationProject\\YotiTest\\src\\main\\java\\Screenshots\\EAddress2.jpg"));
        Assert.assertTrue(eap.AssertNewAddr());
        driver.close();
    }
}
