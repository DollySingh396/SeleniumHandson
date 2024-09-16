import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class navigationalCommandsDemo {



    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();

//        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        URL myUrl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.navigate().to(myUrl);


        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println("Current url is : "+driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("Current url is :" +driver.getCurrentUrl());

        driver.navigate().refresh();

    }
}
