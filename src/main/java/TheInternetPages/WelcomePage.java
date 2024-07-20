package TheInternetPages;

import PagesPakage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {
    //locators
    final private By fileUploadLink = By.xpath("//a [@href='/upload']");
    
    /*final private By dynamicLoadingLink = By.xpath("//a [@href='/dynamic_loading']");*/
    final private By dynamicLoadingLink = By.xpath("//a[text()='Dynamic Loading']");
    
    
    //variables
    final private String url =  "https://the-internet.herokuapp.com/";

    //constructor
    public WelcomePage (WebDriver driver) {
        super(driver);
    }

    //actions
    public WelcomePage navigate(){
        navigate(url);
        return this;
    }

    public FileUploaderPage RedirectToFileUpload(){
        click(fileUploadLink);
        return new FileUploaderPage(driver);
    }


    public DynamicallyLoadedElements RedirectToDynamicLoading(){
        click(dynamicLoadingLink);
        return new DynamicallyLoadedElements(driver);
    }
}
