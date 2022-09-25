package JavaPrograms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class excelDataImport {
    public static void main(String[] args) throws IOException {

        FileInputStream testDataSheet = new FileInputStream("C:\\Users\\Mayuresh Nazare\\Desktop\\testDataSheet.xlsx");
        XSSFWorkbook xceldoc = new XSSFWorkbook(testDataSheet);

        int sheetCount = xceldoc.getNumberOfSheets();

        for (int i = 0; i < sheetCount; i++) {  //Identify and compare sheet name
            if (xceldoc.getSheetName(i).equalsIgnoreCase("Sheet1")) {
                XSSFSheet sheet = xceldoc.getSheetAt(i);

                Iterator<Row> row = sheet.iterator();    //Sheet is collection of rows.
                Row firstRow = row.next();
                Iterator<Cell> cell = firstRow.cellIterator(); //row is collection of cells
                int k = 0;
                int column = 0;
                while (cell.hasNext()) {
                    Cell val = cell.next();
                    if (val.getStringCellValue().equalsIgnoreCase("Data2")) {
                        column = k;

                    }
                    k++;
                }
               // System.out.println(column);

                while(row.hasNext()){

                   Row r = row.next();
                  if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Login")){
                      Iterator<Cell> cellValue=r.cellIterator();
                      while (cellValue.hasNext()){
                          System.out.println(cellValue.next().getStringCellValue());
                      }
                  }
                }
            }
        }

    }
}
