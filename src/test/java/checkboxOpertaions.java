import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class checkboxOpertaions {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // select a specific checkbox
//        driver.findElement(By.xpath("//input[@id=\"tuesday\"]")).click();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));

//        // to select all checkboxes - approach 1 enhanced for loop
//        for( WebElement checkbox : checkboxes){
//            checkbox.click();
//        }

        // to select all checkboxes - approach 2
//        for(int i = 0; i < checkboxes.size(); i++){
//            checkboxes.get(i).click();
//        }


        // select last 3 checkboxes
        // total checkboxes we can get from size i.e. 7 and want to select last 3, so 7 - 3 = 4
        // start index will be 4
//        for(int i = 4; i < checkboxes.size(); i++){
//            checkboxes.get(i).click();
//        }



        // select checkboxes alternative
//        for(int i = 0; i < checkboxes.size(); i++){
//            if(i%2 == 0){
//                checkboxes.get(i).click();
//            }
//        }

        // select first 2 checkboxes
        for(int i = 0; i < 2; i++){
            checkboxes.get(i).click();
        }

        Thread.sleep(5000);
        // unselect first 2 selected checkboxes
        for(int i = 0; i < checkboxes.size(); i++){

            if(checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();
            }
        }



    }
}
