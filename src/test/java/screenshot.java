import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class screenshot {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // take full screen shot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//        File targetFile = new File( System.getProperty("user.dir")+"/screenshots/fullpageSS.png");
//        sourceFile.renameTo(targetFile);

        // take specifc section ss

//        WebElement element = driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
//        File sourceFile = element.getScreenshotAs(OutputType.FILE);
//        File targetFile = new File( System.getProperty("user.dir")+"/screenshots/featureSection.png");
//        sourceFile.renameTo(targetFile);


        // take ss of web element
        WebElement element = driver.findElement(By.xpath("//div[@class=\"header-logo\"]"));
        File sourceFile = element.getScreenshotAs(OutputType.FILE);
        File targetFile = new File( System.getProperty("user.dir")+"/screenshots/headerLogo.png");
        sourceFile.renameTo(targetFile);

        driver.quit();





    }
}
