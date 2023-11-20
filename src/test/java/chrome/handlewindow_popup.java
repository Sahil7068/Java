package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class handlewindow_popup {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");
        driver.findElement(By.xpath("//a[text()='RUN POPUP TEST']")).click();
        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();
        String parwin = it.next();
        System.out.println("parentwindow: " + parwin);

        String chilwin = it.next();
        System.out.println("child window: " + chilwin);
        driver.switchTo().window(chilwin);
        Thread.sleep(2000);
        System.out.println("child window title: " + driver.getTitle());
        driver.close();


    }
}
