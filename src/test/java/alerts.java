import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();

        // Simple Alert
        Alert myAlert1 = driver.switchTo().alert();
        System.out.println("Text in alert 1 is :" +myAlert1.getText());
        myAlert1.accept();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();

        // Confirmation Alert
        Alert myAlert2 = driver.switchTo().alert();
        System.out.println("Text in alert 2 is :" +myAlert2.getText());
        myAlert2.dismiss();
//        myAlert2.accept();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();

        // Prompt Alert
        Alert myAlert3 = driver.switchTo().alert();
        System.out.println("Text in alert 3 is :" +myAlert3.getText());
        myAlert3.sendKeys("This is sent from automation");
        myAlert3.accept();



    }

    }
