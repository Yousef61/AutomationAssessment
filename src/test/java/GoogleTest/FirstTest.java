package GoogleTest;

import GooglePages.GoogleSearchPage;
import GooglePages.SearchResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstTest {
    private WebDriver driver;

    @BeforeMethod
    void setUp(){
        // Open Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        new GoogleSearchPage(driver)
                .navigate()
                .Search("Selenium WebDriver");

    }

    @Test
    void thirdElementText(){

        String expectedText = "selenium webdriver";
        new SearchResult(driver)
                .openThirdSearchResult(expectedText);

    }
    @AfterMethod
    void closeBrowser(){
        driver.quit();
    }
}
