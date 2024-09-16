import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class javaScriptExecutor {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // driver is of WebDriver parent & js is of JavaScriptExecutor parent so need to typecast


//        ChromeDriver dri = new ChromeDriver();
//        JavascriptExecutor jss = dri;
        // both dri & jss has same parent JavaScriptExecutor so no need to type cast


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();

        // pass text in input box using javaScriptExecutor
        WebElement inputBox = driver.findElement(By.xpath("//input[@id=\"name\"]"));
        js.executeScript("arguments[0].setAttribute('value','Dolly')",inputBox);

        // clicking radio button using javaScriptExecutor
        WebElement radioButton = driver.findElement(By.xpath("//input[@id=\"male\"]"));
        js.executeScript("arguments[0].click()", radioButton);









    }
}
