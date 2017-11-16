package utils;
 
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class DataInputProvider{
 
       public static Object[][] getAllSheetData(String dataSheetName) {
 
              Object[][] data = null;
 
              try {
                     FileInputStream fis = new FileInputStream(new File("./data/"+dataSheetName+".xlsx"));
                     XSSFWorkbook workbook = new XSSFWorkbook(fis);
                     XSSFSheet sheet = workbook.getSheetAt(0);    
 
                     // get the number of rows
                     int rowCount = sheet.getLastRowNum();
 
                     // get the number of columns
                     int columnCount = sheet.getRow(0).getLastCellNum();
                     data = new String[rowCount][columnCount];
 
 
                     // loop through the rows
                     for(int i=1; i <=rowCount; i++){
                           try {
                                  XSSFRow row = sheet.getRow(i);
                                  System.out.println(row.getCell(i));
                                  for(int j=0; j <columnCount; j++){ // loop through the columns
                                         System.out.println(row.getCell(j));
                                         try {
                                                String cellValue = "";
                                                try{
                                                       cellValue = row.getCell(j).getStringCellValue().toString();
                                                }catch(NullPointerException e){
 
                                                }
 
                                                data[i-1][j]  = cellValue; // add to the data array
                                         } catch (Exception e) {
                                                e.printStackTrace();
                                         }                         
                                  }
 
                           } catch (Exception e) {
                                  e.printStackTrace();
                           }
                     }
                     fis.close();
                     workbook.close();
              } catch (Exception e) {
                     e.printStackTrace();
              }
 
              return data;
             
       }
 
}
 
 