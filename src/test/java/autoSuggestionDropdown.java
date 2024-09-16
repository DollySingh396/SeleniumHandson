import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class autoSuggestionDropdown {



    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div//textarea[@title=\"Search\"]")).sendKeys("selenium");
        Thread.sleep(5000);

        List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        System.out.println("No of options in suggestion list are: "+suggestionList.size());

        for( WebElement suggestion : suggestionList){

            System.out.println("Suggestion value is "+ suggestion.getText());

            if (suggestion.getText().equals("selenium interview questions")){
                suggestion.click();
                break;
            }
        }




    }
}
