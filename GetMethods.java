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

/ *  output
Launching the browser...
Browser is Launched...
Page Title...OrangeHRM
Current url is https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
The window id handle is...2196719A495487F22003B3BD06C2738D

* /


    // using the getWindowHandles method

package webdrivermethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {

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
        Thread.sleep(5000);
        System.out.println("The window id handle is..." + windowHandleId);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        System.out.println("Window Handles id ...");
        Set<String> windowHandleIDs = driver.getWindowHandles();
        for( String winHandle:windowHandleIDs){
            System.out.println(winHandle);
        }



    }
}

/ * 

Launching the browser...
Browser is Launched...
Page Title...OrangeHRM
Current url is https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
The window id handle is...22A35FB5AA837941924BFAEE9364EBC7
Window Handles id ...
22A35FB5AA837941924BFAEE9364EBC7
123EF7F67602B83A697DC06FB43B65F5

    */


