import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethods {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //get(url)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(5000);

        //Browser Methods
//        driver.close(); // will close the window tab on which driver is focussed
        driver.quit(); // close all the window tabs of browser





    }

}
