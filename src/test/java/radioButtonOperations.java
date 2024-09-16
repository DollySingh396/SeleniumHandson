import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class radioButtonOperations {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"radio\"]"));
        System.out.println("No of radio buttons are : "+radioButtons.size());

        for ( WebElement radioButton : radioButtons){
            radioButton.click();
            Thread.sleep(5000);
        }




    }
}
