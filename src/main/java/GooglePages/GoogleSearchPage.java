package GooglePages;


import PagesPakage.BasePage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPage extends BasePage {
    //locators
    final private By searchInput = By.name("q");
    final private By SearchButton= By.name("btnK");

    //variables
    final static private String url = "https://www.google.com/ncr";

    //constructor
    public GoogleSearchPage (WebDriver driver) {
       super(driver);
    }

    //actions
   public GoogleSearchPage navigate(){

        navigate(url);
        return this;
    }

    public SearchResult Search(String query){
        Enter(searchInput, query);
        return new SearchResult(driver);
    }
}
