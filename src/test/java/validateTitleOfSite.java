import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class validateTitleOfSite {


    public static void main(String[] args){

        // 1. Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver(); -- won't work as edge is not installed in the system
        // OR  ChromeDriver driver1 = new ChromeDriver();
        // it will call chrome driver constructor which will launch Chrome browser
        // also you need to have browsers installed in the system then only it will execute otherwise won't work


        // 2. Open url https://demo.opencart.com/

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize(); // maximizing window size


        // 3. Validate title should be "Your Store"
        String actualTitle = driver.getTitle();

        if(actualTitle.equals("Your Store"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");


        // 4. Close browser
        driver.close();


    }
}
