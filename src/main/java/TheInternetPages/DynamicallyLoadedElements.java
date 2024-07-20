package TheInternetPages;

import PagesPakage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class DynamicallyLoadedElements extends BasePage {

    //locators
    By ExampleLink2 = By.xpath("//a[contains (text(),'Example 2')]");

    //variables  //button/parent::div[@id='start']

    //constructor
    public DynamicallyLoadedElements(WebDriver driver) {
        super(driver);
    }

    public DynamicallyLoadedSuccessfully ClickOnExample2Link(){
        click(ExampleLink2);
        return new DynamicallyLoadedSuccessfully(driver);
    }
}
