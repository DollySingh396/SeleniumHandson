import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class switchBetweenDifferentBrowserTabs {


    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowHndls = driver.getWindowHandles();

        // Approach 1
        /*
        List<String> windowLists = new ArrayList<>(windowHndls);

        String parentWindow = windowLists.get(0);
        String childWindow = windowLists.get(1);

        driver.switchTo().window(childWindow);
        System.out.println("current opened tab is: "+driver.getTitle());

        driver.switchTo().window(parentWindow);
        System.out.println("current opened tab is: "+driver.getTitle());
*/

        // Approach 2
        for(String winHdl : windowHndls){
            String currentWindowTitle = driver.switchTo().window(winHdl).getTitle();

            if(currentWindowTitle.equals("OrangeHRM")){
                System.out.println("Current window url is "+driver.getCurrentUrl());
            }

        }


    }

}
