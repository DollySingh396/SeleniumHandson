import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class scrollBar {



    public static void main(String[] arg) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        // scroll down page by pixel number
        js.executeScript("window.scrollBy(0,1500)", "");
        System.out.println("current Y pixel value is "+ js.executeScript("return window.pageYOffset;"));
//        window.pageXOffset to get X axis pixels
        Thread.sleep(5000);

        // scroll the page till element is visible
        WebElement element = driver.findElement(By.xpath("//strong[text() = 'Featured products']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("current pixel is "+ js.executeScript("return window.pageYOffset;"));
        Thread.sleep(5000);

        // scroll the page till last
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // document.body.scrollWidth -> for horizontal scroll bar
        System.out.println("last pixel is "+ js.executeScript("return window.pageYOffset;"));

        // scroll back to initial position
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        System.out.println("starting pixel is "+ js.executeScript("return window.pageYOffset;"));






    }
}
