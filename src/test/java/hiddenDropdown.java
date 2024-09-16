import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class hiddenDropdown {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
            driver.manage().window().maximize();

            // login
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

            Thread.sleep(2000);
            // clicking on PIM
            driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();

            Thread.sleep(5000);
            //click on dropdown
            driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
            Thread.sleep(5000);

            //get no of options in dropdown
            List<WebElement> options = driver.findElements(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]//span"));
            System.out.println("No of options are "+options.size());


            // select single option
            driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();




        }

}
