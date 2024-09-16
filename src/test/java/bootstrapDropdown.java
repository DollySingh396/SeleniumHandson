import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class bootstrapDropdown {



    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(@class,\"multiselect\")]")).click();

        driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]//label"));
        System.out.println("No of options are "+options.size());

        for( WebElement op : options) {

            System.out.println("Value of option is " + op.getText());

            List<WebElement> checkboxElements = driver.findElements(By.xpath(".//input[@type='checkbox']"));

            for (WebElement checkbox : checkboxElements) {

                boolean flag = checkbox.isSelected();
                if (flag) {
                    checkbox.click();
                    Thread.sleep(1000);
                }
            }
        }

    }

}
