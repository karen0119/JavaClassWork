package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {
        //to get Excel file path
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        // this is a special call which knows how to read the data from EXCEL files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        List<Map<String,String>> excelData=new ArrayList<>();
        Row headerRow= sheet.getRow(0);

        // short code to print data from Exel sheet
        for (int rows = 1; rows < sheet.getPhysicalNumberOfRows(); rows++) { //sheet.getPhysicalNumberOfRows gives the row size
            Row row= sheet.getRow(rows);

            Map<String, String> rowMap=new HashMap<>();
            for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) { //row.getPhysicalNumberOfCells gives the col size
                String key=headerRow.getCell(col).toString();
                String value=row.getCell(col).toString();
                rowMap.put(key,value);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}
