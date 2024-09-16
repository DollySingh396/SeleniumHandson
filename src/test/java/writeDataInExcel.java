import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeDataInExcel {


    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testdata/outputFile.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DataSheet");

        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("welcome");
        row1.createCell(1).setCellValue("to");
        row1.createCell(2).setCellValue("Excel!!");

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("welcome");
        row2.createCell(1).setCellValue("to");
        row2.createCell(2).setCellValue("Excel!!");

        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("welcome");
        row3.createCell(1).setCellValue("to");
        row3.createCell(2).setCellValue("Excel!!");

        workbook.write(file);
        workbook.close();
        file.close();





    }
}
