import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestTelran extends TestBase{

    @Test
    public void testTelRan() throws InterruptedException {
        openSite("https://www.tel-ran.com/");
        //Главная
        click(By.id("comp-k2d3m6ja0label"));
        printTitle();
        //О нас
        click(By.id("comp-k2d3m6ja1label"));
        printTitle();
        //Курсы
        click(By.id("comp-k2d3m6ja2label"));
        printTitle();
        //Трудоустройство
        click(By.id("comp-k2d3m6ja3label"));
        printTitle();
        //Отзывы
        click(By.id("comp-k2d3m6ja4"));
        printTitle();
        //Блог
        click(By.id("comp-k2d3m6ja5"));
        printTitle();
        //Контакты
        click(By.id("comp-k2d3m6ja6"));
        printTitle();

}


}
