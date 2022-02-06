package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createNewAccountPage extends BasePage{


    public createNewAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="[name=\"id_gender\"][value=\"1\"]")
    private WebElement MrsRadioButton;

    @FindBy(name="firstname")
    private WebElement nameTextbox;

    @FindBy(name="lastname")
    private WebElement lastNameTextbox;

    @FindBy(name="email")
    private WebElement emailTextbox;

    @FindBy(name="password")
    private WebElement passwordTextbox;

    @FindBy(name="birthday")
    private WebElement bdayTextbox;

    @FindBy(name="customer_privacy")
    private WebElement customerDataPrivacyCheckbox;

    @FindBy(name="psgdpr")
    private WebElement termsOfPrivacyCheckbox;

    @FindBy(css=".form-footer>.btn-primary")
    private WebElement saveButton;

    public void fillRegisterForm(String firstName, String lastName, String email, String birthday, String password){
        nameTextbox.sendKeys(firstName);
        lastNameTextbox.sendKeys(lastName);
        emailTextbox.sendKeys(email);
        bdayTextbox.sendKeys(birthday);
        passwordTextbox.sendKeys(password);
        MrsRadioButton.click();
        customerDataPrivacyCheckbox.click();
        termsOfPrivacyCheckbox.click();
        saveButton.click();
    }

    public boolean isPageDisplayed(){
        return saveButton.isDisplayed();
    }
}
