import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class writeDynamicDataInExcel {


    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testdata/dynamicDataFile.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DynamicSheetData");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no of rows ");
        int rows = scan.nextInt();
        System.out.println("Enter no of columns ");
        int cols = scan.nextInt();

        for( int r = 0; r <= rows; r++){

            XSSFRow currentRow = sheet.createRow(r);
            for(int c = 0; c < cols; c++){

                XSSFCell currentCell = currentRow.createCell(c);
                currentCell.setCellValue(scan.next());

            }
        }

        workbook.write(file);
        workbook.close();
        file.close();


    }
}
