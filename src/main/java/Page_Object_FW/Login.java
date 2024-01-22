package Page_Object_FW;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;

public class Login extends Hooks{
    @FindBy(linkText = "Log in")
    WebElement _loginlink;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement _email;
    @FindBy(xpath ="//input[@id='Password']" )
    WebElement _password;
    @FindBy(xpath ="//button[normalize-space()='Log in']")
    public WebElement _login;
    public void loginPage() throws InterruptedException, IOException {
       Utils.clickOnElements(_loginlink);
       Utils.enterText(_email,"komal_darji02@yahoo.co.uk");
       Utils.enterText(_password,"123456");
       Utils.clickOnElements(_login);
       Utils.takeScreenShot("loginPage");
        System.out.println("LOGIN IS SUCCESSFUL");
        Thread.sleep(2000);


    }
}
