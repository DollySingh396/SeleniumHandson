import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class basicLocators {

    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // find web elements using basic locators

        /*
        // by name
        driver.findElement(By.name("search")).sendKeys("Iphone 15");

        // by id
        boolean logoIsVisibleFlag = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println("Logo is visible " + logoIsVisibleFlag);

        // by LinkText
        driver.findElement(By.linkText("Tablets")).click();

        //by PartialLinkText
        driver.findElement(By.partialLinkText("Soft")).click();

        // by class name
        List<WebElement> listOfElements = driver.findElements(By.className("list-inline-item"));
        System.out.println("Total no of elements are " +listOfElements.size());

        for ( WebElement e : listOfElements){
            System.out.println("each element details are " +e.getText());
        }

        // by tag name

        List<WebElement> anchorTagList = driver.findElements(By.tagName("a"));
        System.out.println("No of anchor tags are "+ anchorTagList.size());
        for ( WebElement e : anchorTagList){
            System.out.println("each element details are " +e.getText());
        }
*/

        // 5. Close browser
        driver.close();


    }
}
