package Page_Object_FW;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;

public class Utils extends Hooks {
    public static void takeScreenShot(String fileName)throws IOException{
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\rajan\\Desktop\\POM_Framwork1\\src\\test\\ScreenShot"+fileName+".jpg"));
    }

    public static void clickOnElements(WebElement element) {element.click();
    }
    public static void enterText(WebElement element,String text){element.sendKeys(text);
    }
    public static void selectValue(WebElement element, String Value){
        Select select = new Select(element);
        select.selectByValue(Value);
    }
    public static void selectIndex(WebElement element, String Index){
        Select select = new Select(element);
        select.selectByIndex(Integer.parseInt(Index));
    }
    public static void selectVisibleText(WebElement element, String VisibleText){
        Select select = new Select(element);
        select.selectByVisibleText(VisibleText);
    }
}
