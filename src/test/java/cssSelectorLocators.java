import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocators {


    public static void main( String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        // tag & id combination
//        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone 15");
        // tag name is optional
//        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Tablets");


        // tag & class name combination
//        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Shirts");
//        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("trousers"); // tag name is optional

        // tag & attribute combination
        //to read " add backward slash
//        driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("trousers");
//        driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("cars"); // tag name is optional

        //tag, class & attribute combination
//        driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("trucks");
        driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("trucks");// tag name is optional






        //driver.quit();

    }
}
