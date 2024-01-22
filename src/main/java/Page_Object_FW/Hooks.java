package Page_Object_FW;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

public class Hooks {
    static WebDriver driver;
    public Hooks() {
        PageFactory.initElements(driver,this);
    }
    @BeforeSuite
    public void browserSetUp(){
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setUp() {
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterMethod
    public static void screenshot(ITestResult result) throws IOException{
        if(ITestResult.FAILURE==result.getStatus()){
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("C:\\Users\\rajan\\Desktop\\POM_Framwork1\\src\\test\\ScreenShot"+file+".jpg"));

        }
    }
    @AfterSuite
    public  void
    tearDown(){
        driver.quit();
    }

}
