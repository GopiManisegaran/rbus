package wrappers;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
 
import utils.DataInputProvider;
 
public class Redbus extends GenericWrappers {
      
       public String browserName;
       public String dataSheetName;    
       public String url;
 
 
       @BeforeTest
       public void beforeTest(){
              loadObjects();
       }
      
       @BeforeMethod
       public void beforeMethod(){
              invokeApp(browserName,url);
       }
             
 
       @AfterTest
       public void afterTest(){
              unloadObjects();
       }
      
       @AfterMethod
       public void afterMethod(){
              closeBrowser();           
       }
      
       @DataProvider(name="fetchData")
       public Object[][] getData(){
              return DataInputProvider.getAllSheetData(dataSheetName);         
       }     
      
      
}
 