import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class zoomInZoomOut {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);
        driver.manage().window().minimize();

        Thread.sleep(5000);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(5000);

        js.executeScript("document.body.style.zoom='80%'");


    }
}
