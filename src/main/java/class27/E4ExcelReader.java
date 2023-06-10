package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {
        //to get Excel file path
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        // this is a special call which knows how to read the data from EXCEL files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");


        // short code to print data from Exel sheet
        for (int rows = 0; rows < sheet.getPhysicalNumberOfRows(); rows++) { //sheet.getPhysicalNumberOfRows gives the row size
            Row row= sheet.getRow(rows);

            for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) { //row.getPhysicalNumberOfCells gives the col size
                System.out.print(row.getCell(col)+" ");
            }
            System.out.println(); // to skip a line
        }

      /*  Long code to print data from exel sheet:
        System.out.print(row.getCell(0)+" ");
        System.out.print(row.getCell(1)+" ");
        System.out.print(row.getCell(2)+" ");
        System.out.print(row.getCell(3)+" ");
        System.out.print(row.getCell(4)+" ");

       */

    }
}
