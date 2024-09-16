import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class mouseHoverAction {



    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions action = new Actions(driver);

        // Approach 1
        action.moveToElement(desktops).moveToElement(mac).click().build().perform();

        // Approach 2
        // this will also work as perform will call build internally
        action.moveToElement(desktops).moveToElement(mac).click().perform();





    }
}
