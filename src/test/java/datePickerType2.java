import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class datePickerType2 {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();

        //input DOB
        String requiredYear = "2025";
        String requiredMonth = "June";
        String requiredDate = "15";

        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//span[@class=\"icon_calendar\"]")).click();

        selectDateMonthYear(driver,requiredDate,requiredMonth, requiredYear);


    }

    public static void selectDateMonthYear(WebDriver driver, String requiredDate, String requiredMonth, String requiredYear ){

        // year
        WebElement yearDropdown = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
        Select year = new Select(yearDropdown);
        year.selectByValue(requiredYear);

        while (true){

            //month
            String month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();

            Month actualMonthObject = convertStringToObjectMonth(month);
            Month requiredMonthObject =  convertStringToObjectMonth(requiredMonth);

            int result = actualMonthObject.compareTo(requiredMonthObject);

            if(result < 0){
                // past month
                driver.findElement(By.xpath("//span[text()=\"Prev\"]"));

            }
            else if (result > 0){
                // future mon
                driver.findElement(By.xpath("//span[text()=\"Next\"]"));
            }
            else {
                break;
            }
        }

        //date
        List<WebElement> allDates = driver.findElements(By.xpath("//td//a"));

        for( WebElement date : allDates){
            if(date.getText().equals(requiredDate)){
                date.click();
            }
        }

    }

    public static Month convertStringToObjectMonth(String month){

        HashMap<String, Month> monthMap= new HashMap<>();
        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month convertedMonth = monthMap.get(month);

        if( convertedMonth == null ){
            System.out.println("Invalid month");
        }
            return convertedMonth;

    }



}
