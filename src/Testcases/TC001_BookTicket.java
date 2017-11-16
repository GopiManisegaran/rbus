package Testcases;
 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import pages.RedbusHomePage;
import wrappers.Redbus;
 
public class TC001_BookTicket extends Redbus{
      
       @BeforeClass
       public void setData() {
              dataSheetName = "TC001_BookTicket";
              browserName = "chrome";
              url="https://www.redbus.in/";
       }
      
       @Test(dataProvider = "fetchData")
      public void BookTicket(String fromplace, String toplace, String Expected_Month, String Expected_Date, String x, String y,String x1, String y1, String mail, String no, String name, String gender, String age, String tag) throws InterruptedException {
              new RedbusHomePage(driver)
               .enterFromPlace(fromplace)
                     .enterToPlace(toplace)
                     .enterFromDate(Expected_Month, Expected_Date)
                     .clickSearchButton()
                     .clickViewSeatButton()
                     .selectSeat(x, y, x1, y1)
                     .selectBoardingPoint()
                     .selectDestinationPoint()
                     .clickProceedButton()
                     .enterMailId(mail)
                     .enterPhoneNO(no)
                     .enterName(name)
                  .selectGender(gender)
                  .enterAge(age)
                  .clickProceed()
                  .Verification(tag);         
       }
 
}