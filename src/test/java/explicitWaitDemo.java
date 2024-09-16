import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWaitDemo {



    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // create one object of WebDriverWait class // declaration
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //get(url)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //now we are asking to wait until the expected condition is fulfilled, here we are asking to wait until
        // the web element located by the xpath is visible on the web page
        // if condition is true then it will return the web element located by the locator
        // we are storing the web element in an object of Web element
        WebElement usernameTextBox = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='username']")));
        WebElement passwordTextBox = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='password']")));

        // in web element object we are sending data Admin
        usernameTextBox.sendKeys("Admin");
        passwordTextBox.sendKeys("admin123");

        WebElement loginButtom = explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));

        loginButtom.click();

        // driver.close();



    }




}



