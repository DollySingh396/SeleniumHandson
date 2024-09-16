import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class datePickerAssignment {



    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://dummy-tickets.com/buyticket");
        driver.manage().window().maximize();
/*
        driver.findElement(By.xpath("//form[@id=\"flight_oneway\"]//input[@name=\"source[]\"]")).sendKeys("Delhi");
        driver.findElement(By.xpath("//ul[@class=\"suggestions-list\"]//p[contains(text(), 'Indira')]")).click();

        driver.findElement(By.xpath("//form[@id=\"flight_oneway\"]//input[@name=\"destination[]\"]")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//ul[@class=\"suggestions-list\"]//p[contains(text(), 'Shivaji')]")).click();
*/
        driver.findElement(By.xpath("//input[@id=\"dp1717555764564\"]")).click();

        WebElement monthDropdown = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("Oct");

        WebElement yearDropdown =driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("2023");

        List<WebElement> dates = driver.findElements(By.xpath("//tbody//tr//td[@data-handler=\"selectDay\"]"));
        String expectedDate = "03";

        for( WebElement date : dates){

            if(date.getText().equals(expectedDate)){
                date.click();
                break;
            }
        }








    }
}
