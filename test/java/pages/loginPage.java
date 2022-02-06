package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{

    public loginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".no-account>a")
    public WebElement noAccount;


    public void clickNoAccount(){
        noAccount.click();
    }
}
