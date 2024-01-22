package Page_Object_FW;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.IOException;

public class Wish extends Hooks{
    @FindBy(css = ".wishlist-label")
    WebElement wishlist;
    @FindBy(xpath ="//div[@class='no-data']" )
    private WebElement error;
    public void WishListPage() throws InterruptedException, IOException {
        Utils.clickOnElements(wishlist);
        error.isDisplayed();
        Assert.assertTrue(error.isDisplayed());
        Utils.takeScreenShot("error");
        System.out.println("WISH LIST IS EMPTY");
        Thread.sleep(2000);
    }
}
