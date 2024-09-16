import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class assignment {


    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]"))
                .sendKeys("Selenium");

        driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();
        // to get the count of all serach results, i am trying to find all we elements having same xpath and using size returning the count
        int noOfSearchResults = driver.findElements(By.xpath("//div[@id=\"wikipedia-search-result-link\"]")).size();
        System.out.println("Count of search results is: "+noOfSearchResults);

        for( int i = 1; i <= noOfSearchResults; i++){
            // to generate g=dynamic xpath we are passing i for that we are using String.format(string, index)
            String dynamicXpath = String.format("//div[@class=\"wikipedia-search-results\"]/div[%d]/a", i);
            driver.findElement(By.xpath(dynamicXpath)).click();
        }

        Set<String> handles = driver.getWindowHandles();

        for( String handle : handles){
            driver.switchTo().window(handle);
            System.out.println("Title is "+ driver.getTitle());
            driver.close();
        }


        driver.quit();






    }
}


