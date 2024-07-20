package PagesPakage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;


public class BasePage {

        public final WebDriver driver;

        public BasePage(WebDriver driver) {
            this.driver = driver;
        }

        public void click(By locator) {
            fluentWait(driver -> driver.findElement(locator)).click();
        }

        public void navigate(String URL) {
              driver.navigate().to(URL);
        }


       public String GetText(By locator) {
        return fluentWait(driver -> driver.findElement(locator)).getText();
        }

        public void submit(By locator) {
            fluentWait(driver -> driver.findElement(locator)).submit();
        }

        public void Enter(By locator, String text) {
            //fluentWait(driver -> driver.findElement(locator)).sendKeys(text);
            driver.findElement(locator).sendKeys(text , Keys.RETURN);
        }

    public void sendKeys(By locator, String text) {
        //fluentWait(driver -> driver.findElement(locator)).sendKeys(text);
        driver.findElement(locator).sendKeys(text);
    }

        public void waitForElementAndSendKeys(By locator, String text) {
            fluentWait(driver -> driver.findElement(locator)).sendKeys(text);
        }

        private <T> T fluentWait(Function<WebDriver, T> function) {
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofMillis(250))
                    .ignoring(NotFoundException.class)
                    .ignoring(ElementNotInteractableException.class)
                  //  .ignoring(AssertionError.class)
                    .ignoring(StaleElementReferenceException.class);

            return wait.until(function);
        }
    }

