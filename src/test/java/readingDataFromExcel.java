import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readingDataFromExcel {


    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/testData/Book1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        // get sheet using index by using below method
        // XSSFSheet sheet = workbook.getSheetAt(0)

        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(1).getLastCellNum();

        System.out.println(" Total Rows are "+totalRows); // 4 counting from 0
        System.out.println(" Total Cells are "+totalCells); // 3 counting from 1

        // as per excel rows will start from 0 and cells will start from 1

        // r will start from 0 and 0 is  for header and then 1,2,3,4 are rows
        // c will start from 1, so 1,2,3 columns


        // for java row & col will start from 0
        // so to iterate all rows, we will start from 0 and till total row count - 5 times
        for( int r = 0; r <= totalRows; r++){

            XSSFRow currentRow = sheet.getRow(r);

            // start from 0 and iterate till less than total columns - 3 items
            for(int c = 0; c < totalCells; c++){

                XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell.toString()+"\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();

    }
}
