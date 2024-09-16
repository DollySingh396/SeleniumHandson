import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class sliderAction {



    public static void main(String [] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);

        WebElement min_slider = driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[1]"));
        System.out.println("Current position of minimum slider is "+min_slider.getLocation());
        action.dragAndDropBy(min_slider, 100, 249).perform();
        System.out.println("Current position of minimum slider after moving is "+min_slider.getLocation());


        WebElement max_slider = driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[2]"));
        System.out.println("Current position of maximum slider is "+max_slider.getLocation());
        action.dragAndDropBy(max_slider, -100, 249).perform();
        System.out.println("Current position of maximum slider after moving is "+max_slider.getLocation());






    }
}


