import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class switchToNewWindow {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/");


        // introduced in selenium 4
        // switch to new tab opened
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orangehrm.com/");

        //switch to new window opened
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://orangehrm.com/");

    }



}
