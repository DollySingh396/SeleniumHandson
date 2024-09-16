import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class fileUpload {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        // single file upload
//        driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("/Users/dolly.singh/Downloads/GoogleServices_171284120293395_1717761772306.xlsx");
//
//        if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("GoogleServices_171284120293395_1717761772306.xlsx")){
//            System.out.println("Upload is successful");
//        }


        // multiple files upload

        String file1 = "/Users/dolly.singh/Downloads/GoogleServices_171284120293395_1717761772306.xlsx";
        String file2 = "/Users/dolly.singh/Downloads/GoogleServices_171284120293395_1717761542857.xlsx";
        driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(file1+"\n"+file2);

        int noOfUploads = driver.findElements(By.xpath("//ul[@id=\"fileList\"]//li")).size();

        if(noOfUploads == 2){
            System.out.println("Successful upload of both files");
        }

        // you can also validate the name by iterating each value








    }
}
