package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class rightclick {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://paytm.com/careers/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        driver.manage().deleteAllCookies();

        Actions action = new Actions(driver);
        WebElement ac = driver.findElement(By.xpath("//span[text()='Help us disrupt the digital payments industry']//..//div//span//span"));
        action.contextClick(ac).build().perform();

        Robot rc = new Robot();
        rc.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        rc.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);




    }
}
