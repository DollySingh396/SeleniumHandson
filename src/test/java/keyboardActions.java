import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardActions {


    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        driver.findElement(By.xpath("//textarea[@name=\"text1\"]")).sendKeys("WELCOME!!!");

        // select all text
        action.keyDown(Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).perform();

        // copy text
        action.keyDown(Keys.COMMAND).sendKeys("C").keyUp(Keys.COMMAND).perform();

        // press tab to move to textarea 2 from text area 1
        action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        // paste the copied text
        action.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.COMMAND).perform();
    }


}
