import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dynamicTableAndPagination {



    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        /*
        WebElement userName = driver.findElement(By.xpath("//div//input[@name=\"username\"]"));
        userName.clear();
        userName.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//div//input[@name=\"password\"]"));
        password.clear();
        password.sendKeys("demo");

         */

        int total_Pages = driver.findElements(By.xpath("//ul[@class=\"pagination\"]//li")).size();

        for(int i = 1; i <=total_Pages; i++){

            // condition to click on next pages -- IMPORTANT
            if( i > 1){
                driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li["+i+"]")).click();
            }

            int total_Rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody//tr")).size();
            System.out.println("On Page "+i+ " No of rows are " +total_Rows);

            for(int r = 1; r <= total_Rows; r++){

                String name = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+r+"]//td[2]")).getText();
                System.out.print(name +"\t");
                String price = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+r+"]//td[3]")).getText();
                System.out.print(price +"\t");
                driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+r+"]//td[4]//input[@type=\"checkbox\"]")).click();
                Thread.sleep(2000);
                System.out.println();

            }
            System.out.println();
        }






    }
}
