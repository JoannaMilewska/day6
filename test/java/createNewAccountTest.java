import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class createNewAccountTest extends BaseTest{

    @Test
    public void shouldCreateAccount(){

        String firstName="Asia";
        String lastName="Mmm";
        String birthday="01/01/2000";
        String password="111111";
        String email= randomEmail();

        String expectedName=firstName+ " "+ lastName;
        driver.get("http://146.59.32.4/index.php");

        topBarPage topBarPage=new topBarPage(driver);
        loginPage loginPage=new loginPage(driver);
        createNewAccountPage createNewAccountPage = new createNewAccountPage(driver);


        topBarPage.clickSignInButton(); //klikam sign in
        loginPage.clickNoAccount(); //wybieram opcje, ze nie mam konta
        createNewAccountPage.fillRegisterForm(firstName,lastName,email,birthday,password);

        Assert.assertEquals(topBarPage.getUserNameDisplayed(),expectedName);
    }
    private String randomEmail(){
        String email = RandomStringUtils.randomAlphabetic(10);
        email+="@test.com";
        return email;

    }

    @Test
    public void shouldNotCreateAccountWithoutEmail(){

        String firstName="Asia";
        String lastName="Mmm";
        String birthday="01/01/2000";
        String password="111111";
        String email= " ";

        driver.get("http://146.59.32.4/index.php");

        topBarPage topBarPage=new topBarPage(driver);
        loginPage loginPage=new loginPage(driver);
        createNewAccountPage createNewAccountPage = new createNewAccountPage(driver);



        topBarPage.clickSignInButton(); //klikam sign in
        loginPage.clickNoAccount(); //wybieram opcje, ze nie mam konta
        createNewAccountPage.fillRegisterForm(firstName,lastName,email,birthday,password);

        Assert.assertTrue(createNewAccountPage.isPageDisplayed());
    }

    @Test
    public void shouldShowCorrectPrice(){
        driver.get("http://146.59.32.4/index.php");

        productListPage productListPage = new productListPage(driver);
        itemPage itemPage=new itemPage(driver);
        cartPage cartPage=new cartPage(driver);
        productListPage.chooseItem();
        itemPage.AddMoreItems();
        itemPage.AddMoreItems();
        itemPage.AddToCart();
        Assert.assertEquals(itemPage.calculateExpectedPrice(), cartPage.getTotalPriceDouble());

    }


}
