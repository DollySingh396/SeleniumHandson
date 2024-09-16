import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class brokenLinks {


    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        // get all the links on webpage
        List<WebElement> links = driver.findElements(By.xpath("//a"));

        int noOfBrokenLinks = 0;
        // iterate over each link
        for( WebElement link : links){

            // get value of href tag for each link
            String linkValue= link.getAttribute("href");

            // if link value is empty or is null then print invalid link
            if(  linkValue == null || linkValue.isEmpty()){
                System.out.println("Link is not valid");
                continue;
            }

            // if link value is valid then check link is broken or not
            try{

                // first convert the link value from String to URL object
                URL linkObject = new URL(linkValue);

                // use HttpURLConnection class to create connection with server
                // open connection will open connection to the server
                HttpURLConnection con = (HttpURLConnection) linkObject.openConnection();
                // connect will connect to the server & return the response code
                con.connect();

                // verify the response code is >= 400 using getResponseCode method
                // if yes link is broken link

                if(con.getResponseCode() >= 400){
                    System.out.println(linkValue+ " This link is broken");
                    // counting no of broken links
                    noOfBrokenLinks++;
                }
                // link is not a broken link
                else {
                    System.out.println("This link is NOT a broken link");

                }

            }
            // catch exception if any
            catch ( Exception e) {

            }

        }

        System.out.println("Total no of broken links are "+noOfBrokenLinks);



    }
}
