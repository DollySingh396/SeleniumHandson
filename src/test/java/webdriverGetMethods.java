import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverGetMethods {



    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        //get(url)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //getTitle
        System.out.println("Title of the page is : " + driver.getTitle());

        //getCurrentURL
        System.out.println("URL of the current page is : "+driver.getCurrentUrl());

        //getWindowHandle
        System.out.println("Current Window Handle is : " +driver.getWindowHandle());

        //getWindowHandles
        System.out.println("All Window Handles of opened browser are : " +driver.getWindowHandles());

        //getPageSource
        System.out.println("Page Source is : "+driver.getPageSource());
    }
}
