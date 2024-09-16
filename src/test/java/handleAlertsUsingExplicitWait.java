import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class handleAlertsUsingExplicitWait {


    // handle alerts w/o using switchTo() method, by using explicit wait()
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10)); // declaration of explicit wait


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
        Thread.sleep(5000);

        Alert alert1 = myWait.until(ExpectedConditions.alertIsPresent());
        // if alert is not found NoAlert exception will be thrown
        System.out.println("Text in alert 1 is: "+alert1.getText());
        alert1.accept();


//        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
//        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();

    }

}
