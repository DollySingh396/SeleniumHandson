import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class staticTable {



    public static void main( String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // find total no of rows
        int rowsCount = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
        System.out.println("Total no of Rows are: "+rowsCount);


        // find total no of columns
        int columnCount = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
        System.out.println("Total no of columns are: "+columnCount);


        //print each row-column data

        for( int r = 1; r <= rowsCount; r++){

            for( int c = 1; c <= columnCount; c++){

                if(r == 1){
                    System.out.print(driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//th["+c+"]")).getText() + "\t");

                }
                else{
                    System.out.print(driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText() +"\t");

                }

            }
            System.out.println();
        }

        // finding the books that are written by Author Mukesh

        for( int r = 2; r <= rowsCount; r++){

            String authorName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
            if( authorName.equals("Mukesh")){
                System.out.println("Book written by "+authorName+ " is " +driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText() + "\t");
            }
        }

        // calculating total price of all books
        int totalPrice = 0;

        for( int r = 2; r <= rowsCount; r++){

            totalPrice = totalPrice +  Integer.parseInt(driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText());

        }
        System.out.println("Total Price of all books is "+totalPrice);



    }
}
