import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class shadowDOM {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://dev.automationtesting.in/shadow-dom");
        driver.manage().window().maximize();

        SearchContext shadowEle1 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        String shadowEleTExt1 = shadowEle1.findElement(By.cssSelector("#shadow-element")).getText();
        System.out.println("Text  is "+shadowEleTExt1);
        Thread.sleep(1000);


        SearchContext shadowEle2 = shadowEle1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        String shadowEleTExt2 = shadowEle2.findElement(By.cssSelector("#nested-shadow-element")).getText();
        System.out.println("Text  is "+shadowEleTExt2);
        Thread.sleep(1000);

        SearchContext shadowEle3 = shadowEle2.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        String shadowEleTExt3 = shadowEle3.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
        System.out.println("Text  is "+shadowEleTExt3);









    }
}
