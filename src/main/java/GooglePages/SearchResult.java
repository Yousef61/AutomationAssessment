package GooglePages;

import PagesPakage.BasePage;
import TheInternetPages.UploadedSuccessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class SearchResult extends BasePage {

    //locators
    By thirdSearchResultLink = By.xpath("//h3[contains(@class,'LC20lb')][3]");
    //By thirdSearchResultLink = By.xpath("(//span [@dir= 'ltr'])[3]");

    //constructor
    public SearchResult(WebDriver driver) {
        super(driver);
    }

    public SearchResult openThirdSearchResult(String expectedText){
        Assert.assertEquals(GetText(thirdSearchResultLink) , expectedText);
        return this;
    }

}
