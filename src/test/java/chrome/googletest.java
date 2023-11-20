package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class googletest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com");
    }

    @Test(priority = 1)
    public void googleTitleTest(){
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test(priority = 2)
    public void gmail(){
        Boolean b = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
        System.out.println(b);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
