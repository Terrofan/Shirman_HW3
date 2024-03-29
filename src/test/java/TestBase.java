import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
        public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void printTitle() throws InterruptedException {
        String text = driver.getTitle();
        System.out.println(text);
        Thread.sleep(2000);
    }

    public void click(By locator) throws InterruptedException {
        driver.findElement(locator).click();
        Thread.sleep(5000);
    }

    public void openSite(String url) {
        driver.get(url);
    }
}
