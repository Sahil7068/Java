package chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class web {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("Google")){
            System.out.println("Title is correct");
        }
        else{
            System.out.println("incorrect");
        }
    }
}
