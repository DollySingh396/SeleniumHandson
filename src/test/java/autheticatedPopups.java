import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class autheticatedPopups {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        driver.get("https://the-internet.herokuapp.com/basic_auth");
        // to handle authenticated popups pass url as below
                driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        driver.manage().window().maximize();

        String text = driver.findElement(By.xpath("//div/p")).getText();
        System.out.println("Text is: "+text);


    }
    }
