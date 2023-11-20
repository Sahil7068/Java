package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertspopup {
    public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
            driver.manage().window().maximize();
            driver.findElement(By.name("proceed")).click();
            Alert alert = driver.switchTo().alert();   // to switch to alert frame
            System.out.println(alert.getText());
            alert.accept();
    }
}
