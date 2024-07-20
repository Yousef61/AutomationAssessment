package TheInternetPages;

import PagesPakage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UploadedSuccessPage extends BasePage {
    //locators
    By uploadedFileName = By.id("uploaded-files");

    //variables

    //constructor
    public UploadedSuccessPage(WebDriver driver) {
        super(driver);
    }

    public UploadedSuccessPage fileNameAssert(String ExpectedFileName){
        Assert.assertEquals(GetText (uploadedFileName) , ExpectedFileName);
        return this;
    }
}
