package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {
    public static void main(String[] args) {

        // WebDriverManager.chromedriver().setup();
        System.out.println("Launching the browser...");
        WebDriver driver = new ChromeDriver();
        System.out.println("Browser is Launched...");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title..." + pageTitle);
        String currentPageUrl = driver.getCurrentUrl();
        System.out.println("Current url is " + currentPageUrl);
        String windowHandleId = driver.getWindowHandle();
        System.out.println("The window id handle is..." + windowHandleId);


    }
}
