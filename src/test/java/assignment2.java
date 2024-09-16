import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class assignment2 {



    public static  void main(String [] args){


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

        // selecting destinations
        WebElement fromDropdown = driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
        Select fromOption = new Select(fromDropdown);
        fromOption.selectByVisibleText("San Diego");

        WebElement toDropdown = driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
        Select toOption = new Select(toDropdown);
        toOption.selectByVisibleText("Berlin");

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        // selecting cheapest flights

        int totalRows = driver.findElements(By.xpath("//table[@class=\"table\"]//tbody//tr")).size();
        int totalColumns = driver.findElements(By.xpath("//table[@class=\"table\"]//tr//th")).size();

        String price =  driver.findElement(By.xpath("//table[@class=\"table\"]//tr[1]//td["+totalColumns+"]")).getText();
        String[] priceArray = price.split("\\$");
        Float minPrice = Float.parseFloat(priceArray[1]);

        System.out.println("initial price value is "+minPrice);

        int row = 0;

        for( int r = 2; r <= totalRows; r++){

            price = driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+r+"]//td["+totalColumns+"]")).getText();
            priceArray = price.split("\\$");
            Float currentPrice = Float.parseFloat(priceArray[1]);
            System.out.println("Current price is "+currentPrice);
            System.out.println("Min price is "+minPrice);

            if(minPrice > currentPrice){
                minPrice = currentPrice;
                row = r;
                System.out.println("upadted row value to "+row);
            }
        }

        System.out.println("Row is "+row);
        driver.findElement(By.xpath("//table//tr["+row+"]//td//input[@value=\"Choose This Flight\"]")).click();





    }
}
