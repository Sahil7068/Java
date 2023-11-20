package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class paytm_new {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://paytm.com/careers/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();

        WebElement webtemp = driver.findElement(By.xpath("//section[@id='paytmperks']//child::a//span//span"));



        scrollIntoView(webtemp, driver);

        driver.findElement(By.xpath("//section[@id='paytmperks']//child::a//span//span")).click();

        Set<String> handle = driver.getWindowHandles();
        Iterator<String> hs = handle.iterator();
        String parentwin = hs.next();
        System.out.println("parent window " + parentwin);

        String childwin = hs.next();
        System.out.println("child window " + childwin);

        driver.switchTo().window(childwin);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentwin);
        driver.quit();

    }


    public static void scrollIntoView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
