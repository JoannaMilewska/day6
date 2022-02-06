package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.logging.FileHandler;

public class topBarPage extends BasePage{

    public topBarPage (WebDriver driver){
        super(driver);
    }

    @FindBy(css=".user-info>a")
    public WebElement signInIcon;

    @FindBy(css="#_desktop_user_info .account>span")
    private WebElement userNameDisplayed;



    public void clickSignInButton(){
       signInIcon.click();
    }
    public String getUserNameDisplayed(){
       //File screeenshot =  userNameDisplayed.getScreenshotAs(OutputType.FILE);
       //File dest = new File("screenshot.png");
        //FileHandler.copy(screeenshot,dest);//trycatch doddac
        return userNameDisplayed.getText();
    }

}
