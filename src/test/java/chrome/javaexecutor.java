package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class javaexecutor {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.website.com/sign-in/?source=SC&country=IN");

        WebElement become = driver.findElement(By.xpath("//a[text()='Webmail']"));
        drawBorder(become, driver);

        WebElement webtemp = driver.findElement(By.xpath("//a[text()='Don't have an account? Join Website.com now.']"));

        scrollPage(driver);  // for scrolling
        scrollIntoView(webtemp, driver);

    }

    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);

    }
    public static void scrollPage(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


    public static void scrollIntoView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


}

