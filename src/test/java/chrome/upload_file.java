package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://html.com/input-type-file/");
        driver.manage().window().maximize();
        driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\user\\Downloads");
    }
}
