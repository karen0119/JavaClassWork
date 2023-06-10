package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {

        //Create an Excel file and keep any data changes if any
        String path=System.getProperty("user.dir")+"//Files\\TestExcelFile.xlsx"; //absolute path
        FileInputStream fileInputStream=new FileInputStream(path);

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream); // 1st create object of class
        Sheet sheet=xssfWorkbook.getSheet("Sheet1"); //to get sheet inside Excel file
        //Sheet sheet=xssfWorkbook.createSheet("Sheet1"); //to create a new sheet inside Excel file
        Row row= sheet.createRow(0); //create row inside Excel sheet
        Cell cell = row.createCell(0); //create cell/column inside Excel sheet
        Cell cell1= row.createCell(1);
        cell.setCellValue("Wael"); //set value to the first column
        cell1.setCellValue("Jacob"); //set value to the second column

        //Used to write data to a file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);

    }
}
