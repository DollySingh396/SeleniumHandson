import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickAction {



    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondbclick3");
        driver.manage().window().maximize();

        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.clear();
        box1.sendKeys("WELCOME!!");

        // double click action
        Actions doubleClickAction = new Actions(driver);
        doubleClickAction.doubleClick(button).perform();

        // validation
        String text = box2.getAttribute("value");
        System.out.println(" Text in box2 is "+text);

        if(text.equals("WELCOME!!")){
            System.out.println("Text is same");
        }
        else{
            System.out.println("Text id different");
        }


    }
}
