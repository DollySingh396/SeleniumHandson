import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class datePicker {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        // Method 1 - directly send date
//        driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("04/12/2025"); //mm//dd//yyyy

        // Method 2 - Select dates from calendar
        driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();


        String expectedFutureMonth = "May";
        String expectedPastMonth = "April";
        String futureYear = "2025";
        String expectedDay = "13";
        String pastYear = "2019";

//        selectFutureDateFromCalendar(driver, expectedDay, expectedFutureMonth, futureYear);
       // Thread.sleep(10000);
        selectPastDateFromCalendar(driver, expectedDay, expectedPastMonth, pastYear);



    }


    public static void selectFutureDateFromCalendar (WebDriver driver, String expectedDay, String expectedMonth, String expectedYear){

        while (true) {

            String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]\n")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]\n")).getText();

            if ( currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)) {
                break;
            }
                driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
        }

            List<WebElement> totalDays = driver.findElements(By.xpath("//td//a"));

            for (WebElement day : totalDays) {
                if (day.getText().equals(expectedDay)) {
                    day.click();
                    break;
                }
            }

        }


    public static void selectPastDateFromCalendar (WebDriver driver, String expectedDay, String expectedMonth, String expectedYear){

        while (true) {

            // select current month & year
            String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]\n")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]\n")).getText();


            if ( currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)) {
                    break;
            }

            driver.findElement(By.xpath("//span[text()=\"Prev\"]")).click();
        }

            List<WebElement> totalDays = driver.findElements(By.xpath("//td//a"));

            for (WebElement day : totalDays) {
                if (day.getText().equals(expectedDay)) {
                    day.click();
                    break;
                }
            }

        }
    }

