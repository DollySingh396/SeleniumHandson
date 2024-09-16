import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class bootstrapdynamicTable {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        driver.manage().window().maximize();

        // login
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//li//span[text()=\"Admin\"]")).click();

        int totalRows = driver.findElements(By.xpath("//div//div[@class=\"oxd-table-body\"]//div[@class=\"oxd-table-card\"]")).size();

        for( int r = 1; r <= totalRows; r++){

            if(r > 1){
                driver.findElement(By.xpath("//div[@class=\"oxd-table-card\"]["+r+"]//div[@role=\"row\"]//div[@role=\"cell\"][1]")).click();
                Thread.sleep(1000);
            }
            String userName = driver.findElement(By.xpath("//div[@class=\"oxd-table-card\"]["+r+"]//div[@role=\"row\"]//div[@role=\"cell\"][2]")).getText();
            String userRole = driver.findElement(By.xpath("//div[@class=\"oxd-table-card\"]["+r+"]//div[@role=\"row\"]//div[@role=\"cell\"][3]")).getText();
            System.out.print("User Name is "+userName+ " UserRole is "+userRole);
            System.out.println();
        }

    }
}
