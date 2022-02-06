package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class itemPage extends BasePage{

    public itemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".touchspin-up")
    private WebElement AddMoreItemsButton;

    @FindBy(css=".current-price")
    private WebElement OneItemPrice;

    @FindBy(css=".add-to-cart")
    private WebElement AddToCartButton;

    public void AddMoreItems(){
        AddMoreItemsButton.click();
    }
    public String getOneItemPrice(){
        return OneItemPrice.getText().replace("$","");
    }

    public void AddToCart(){
        AddToCartButton.click();
    }
    public double calculateExpectedPrice() {
        int itemsQuantity = 3;
        double expectedTotalPrice = itemsQuantity * (Double.valueOf(getOneItemPrice()));
        return expectedTotalPrice;
    }




}
