package TheInternetPages;

import PagesPakage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DynamicallyLoadedSuccessfully extends BasePage {
    //locators
    By startButton = By.xpath("//div[@id='start']/button");
    //By loadingText = By.id("loading");
    By ActualText = By.xpath("//div[@id='finish']/h4");

    //variables

    //constructor
    public DynamicallyLoadedSuccessfully(WebDriver driver) {
        super(driver);
    }

    public DynamicallyLoadedSuccessfully loadedSuccessfully(String expectedText){
        click(startButton);
        Assert.assertEquals(GetText (ActualText) , expectedText);
        return new DynamicallyLoadedSuccessfully (driver);
    }

}
