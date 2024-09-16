import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class rightClickMouseAction {



    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement rightClickButton = driver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]"));

        // action class object
        Actions rightClickAction = new Actions(driver);
        // perform right click action
        rightClickAction.contextClick(rightClickButton).perform();

        // click on copy option of context menu
        driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[3]")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

    }
}
