package TheInternetPages;

import PagesPakage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class FileUploaderPage extends BasePage {
    //locators
    By chooseFileButton = By.cssSelector("input[type=file]");
    By uploadButton     = By.id("file-submit");

    //variables
     File filePath = new File("C:\\Users\\Yousef Abdelrahman\\IdeaProjects\\ConvertedinAssessment\\src\\main\\resources\\Updated - Test Automation Assessment.docx.pdf");
    //constructor
    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public UploadedSuccessPage uploadFile(){
//        WebElement chooseFile = driver.findElement(chooseFileButton);
//        chooseFile.sendKeys(filePath.getAbsolutePath());
        sendKeys(chooseFileButton , filePath.getAbsolutePath());
        click(uploadButton);
        return new UploadedSuccessPage(driver);
    }
}
