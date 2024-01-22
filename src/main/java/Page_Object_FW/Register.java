package Page_Object_FW;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Register extends Hooks{
    @FindBy(css = ".ico-register")
    public WebElement Reg;
    @FindBy(id = "gender-male")
    private WebElement Gender_Male;
    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement FirstName;
    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement LastName;
    @FindBy(css = "select[name='DateOfBirthDay']")
    private WebElement DOB;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    private WebElement DOM;
    @FindBy(css = "select[name='DateOfBirthYear']")
    private WebElement DOY;
    @FindBy(xpath = "//input[@id='Email']")
    private WebElement EMail;
    @FindBy(xpath = "//input[@id='Company']")
    public WebElement Company;
    @FindBy(css = "#Newsletter")
    WebElement newsletter;
    @FindBy(xpath = "//input[@id='Password']")
    private WebElement PassWord;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    private WebElement Confirm_Password;
    @FindBy(xpath = "//button[@id='register-button']")
    private WebElement Register_button;

    public void RegisterPage() throws InterruptedException, IOException {
        Utils.clickOnElements(Reg);
        Utils.clickOnElements(Gender_Male);
        Utils.enterText(FirstName,"RAJAN");
        Utils.enterText(LastName,"DARJI");
        Utils.selectIndex(DOB,"2");
        Utils.selectVisibleText(DOM,"June");
        Utils.selectValue(DOY,"1978");
        Utils.enterText(EMail,"komal_darji02@yahoo.co.uk");
        Utils.enterText(Company,"HSK");
        Utils.clickOnElements(newsletter);
        Utils.enterText(PassWord,"123456");
        Utils.enterText(Confirm_Password,"123456");
        Utils.clickOnElements(Register_button);
        Utils.takeScreenShot("RegisterPage");
        System.out.println("REGISTRATION IS DONE");
        Thread.sleep(2000);


    }
}
