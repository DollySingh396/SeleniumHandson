import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocators {


    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // Xpath with single attribute
//        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");

        // Xpath with multiple attributes
//        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");


        // Xpath with and or operator
//        driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts"); both attributes should be true
//        driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Tshirts");  either of the attributes should be true


        // Xpath with text() - Link text
//        driver.findElement(By.xpath("//*[text() = 'MacBook']")).click();

        // Xpath with text() - inner text
//        boolean isVisible = driver.findElement(By.xpath("//h3[text() = 'Featured']")).isDisplayed();
//        if(isVisible){
//            System.out.println(" Featured heading visible " +isVisible);
//        }


        // Xpath with contains() method
//        driver.findElement(By.xpath("//input[contains(@placeholder, 'Sear')]")).sendKeys("Tshirts");

        //Xpath with starts-with()
//        driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("Tshirts");

        // contains inner text
//        driver.findElement(By.xpath("//[contains(text(),'Sear')]")); // this will check whether string Sear is present in inner text or not
//      //[contains(.,'Sear')] in place of text() you can use . also


        //Chained Xpath
              boolean isVisibleFlag = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println("Is Visible Flag value "+isVisibleFlag);

    }
}
