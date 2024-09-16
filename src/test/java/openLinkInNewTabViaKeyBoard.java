import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class openLinkInNewTabViaKeyBoard {



    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement registerLink = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).click(registerLink).keyUp(Keys.SHIFT).perform();




    }
}



