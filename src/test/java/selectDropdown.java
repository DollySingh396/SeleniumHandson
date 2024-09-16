import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class selectDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // select dropdown
        WebElement countryDropdown = driver.findElement(By.xpath("//select[@id=\"country\"]"));
        Select dropdown = new Select(countryDropdown);
        Thread.sleep(5000);
        dropdown.selectByIndex(1);
        Thread.sleep(5000);
        dropdown.selectByValue("japan");
        Thread.sleep(5000);
        dropdown.selectByVisibleText("France");

        //get all options from a dropdown - use getOptions() method
        List<WebElement> options = dropdown.getOptions();
        System.out.println("Total no of options "+options.size());

        for( WebElement option: options){
            System.out.println("Option value is: "+option.getText());
        }








    }
}


