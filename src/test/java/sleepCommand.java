import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sleepCommand {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //get(url)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000); // pause the execution for 5 seconds

        // below statement will throw NoSuchElementException if you comment Thread.sleep() command
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");





    }
}
