package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class cartPage extends BasePage {
    public cartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-total>.value")
    private WebElement TotalPrice;


    public double getTotalPriceDouble() {
        wait.until(ExpectedConditions.visibilityOf(TotalPrice));
        return Double.valueOf(TotalPrice.getText().replace("$",""));
    }




}
