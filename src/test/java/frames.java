import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {



    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://ui.vision/demo/webtest/frames");
        driver.manage().window().maximize();

// Switch to Frame 1
        // get frame 1 webelement
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        // switch to frame 1 using web element
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Frame1");

        // switch back to main page
        driver.switchTo().defaultContent();

        // Switch to Frame 2
        // get frame 2 webelement
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        // switch to frame 2 using web element
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Frame2");

        // switch back to main page
        driver.switchTo().defaultContent();


        // Switch to Frame 3
        // get frame 3 webelement
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        // switch to frame 3 using web element
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Frame3");
        //switching to frame present inside frame 3, since only one frame is presnet so we can access it directly using index
        // index starts from 0
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
        driver.findElement(By.xpath("//div[@id='i19']//div[@class=\"uHMk6b fsHoPb\"]")).click();


        // switch back to main page
        driver.switchTo().defaultContent();

        // Switch to Frame 4
        // get frame 4 webelement
        WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        // switch to frame 4 using web element
        driver.switchTo().frame(frame4);
        driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("Frame4");


        // switch back to main page
        driver.switchTo().defaultContent();

        // Switch to Frame 5
        // get frame 5 webelement
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        // switch to frame 5 using web element
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//input[@name=\"mytext5\"]")).sendKeys("Frame5");

        driver.findElement(By.xpath("//center/a")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='mce-EMAIL']")).sendKeys("dollysingh@gmail.com");

        driver.quit();





    }
}


