import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class closingSpecificBrowserWindow {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowHndls = driver.getWindowHandles();

        for( String windId : windowHndls){
            String currentWindowIdTitle = driver.switchTo().window(windId).getTitle();
            System.out.println("Title if current window is: "+currentWindowIdTitle);

            if(currentWindowIdTitle.equals("OrangeHRM") || currentWindowIdTitle.equals("Human Resources Management Software | OrangeHRM")){
                driver.close();
            }

        }

    }
}
