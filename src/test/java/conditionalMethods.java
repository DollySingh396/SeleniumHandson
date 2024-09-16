import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {



    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        //get(url)
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        // isDisplayed conditional method on WebElement
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Logo is Displayed : "+logo.isDisplayed());
        //OR
        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Display status is : "+status);


        //isEnabled conditional method on WebElement
        boolean enableStatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Enable status is "+enableStatus);

        //isSelected conditional method on WebElement
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));

        boolean selectedStatus = maleRadioButton.isSelected();
        System.out.println("selected status of male radio button before click "+selectedStatus);
        maleRadioButton.click();
        selectedStatus = maleRadioButton.isSelected();
        System.out.println("selected status of male radio button after click "+selectedStatus);


        //




    }
}
