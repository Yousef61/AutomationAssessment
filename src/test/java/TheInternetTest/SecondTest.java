package TheInternetTest;

import TheInternetPages.FileUploaderPage;
import TheInternetPages.UploadedSuccessPage;
import TheInternetPages.WelcomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class SecondTest {
    private WebDriver driver;

    @BeforeClass
    void setUp(){
        // Open Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        new WelcomePage(driver)
                .navigate()
                .RedirectToFileUpload();

    }

    @Test
    void UploadFile(){

            new FileUploaderPage(driver)
                    .uploadFile();
    }

    @Test (dependsOnMethods = { "UploadFile" })
    void FileUploadedSuccessfully(){
        String ExpectedFileName = "Updated - Test Automation Assessment.docx.pdf";
        new UploadedSuccessPage(driver)
                .fileNameAssert(ExpectedFileName);


    }

    @AfterClass
    void closeBrowser(){
        driver.quit();
    }
}
