import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestTelran extends TestBase{

    @Test
    public void testTelRan() throws InterruptedException {
        openSite("https://www.tel-ran.com/");

        List <WebElement> listNavPanelElements = driver.findElements(By.cssSelector("[class='style-k2elo1p0repeaterButton'][aria-hidden='false']"));
        for(WebElement curr : listNavPanelElements){
            curr.click();
            Thread.sleep(6000);
            printTitle();
        }





}


}
