package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitwait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://paytm.com/careers/");
        driver.manage().window().maximize();

        clickOn(driver, driver.findElement(By.xpath("//span[text()='Help us disrupt the digital payments industry']//..//div//span//span")), 20);
    }

    public static void clickOn(WebDriver driver, WebElement locator, int timeout){
        new WebDriverWait(driver, Duration.ofSeconds(timeout)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }


}
