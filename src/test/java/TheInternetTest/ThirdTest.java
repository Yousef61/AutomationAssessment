package TheInternetTest;

import TheInternetPages.*;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class ThirdTest {

    private WebDriver driver;

    @BeforeClass
    void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        new WelcomePage(driver)
                .navigate()
                .RedirectToDynamicLoading();

    }

    @Test
    void RedirectToExample2Link(){
        new DynamicallyLoadedElements(driver)
                .ClickOnExample2Link();
    }

    @Test (dependsOnMethods = { "RedirectToExample2Link" })
    void PageLoadedSuccessfully(){
        String ExpectedText = "Hello World!";
        new DynamicallyLoadedSuccessfully(driver)
                .loadedSuccessfully(ExpectedText);

    }

    @AfterClass
    void closeBrowser(){
        driver.quit();
    }
}
