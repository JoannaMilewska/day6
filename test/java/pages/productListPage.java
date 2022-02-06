package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productListPage extends BasePage{
    public productListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#content > section > div > div:nth-child(8) > article > div")
    private WebElement bestMug;


    public void chooseItem() {
        bestMug.click();
    }
}
