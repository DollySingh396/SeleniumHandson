import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragAndDropMouseAction {


        public  static  void main (String[] args){

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
            driver.manage().window().maximize();

            WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));
            WebElement target = driver.findElement(By.xpath("//div[@id=\"box106\"]"));

            Actions action = new Actions(driver);
            action.dragAndDrop(source,target).perform();

            WebElement source1 = driver.findElement(By.xpath("//div[@id=\"box106\"]//div[@id='box6']"));
            WebElement target1 = driver.findElement(By.xpath("//div[@id=\"capitals\"]"));

            action.dragAndDrop(source1,target1).perform();


        }



}
