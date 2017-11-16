package pages;
 
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.Redbus;
 
public class RedbusHomePage extends Redbus { 
      
       public RedbusHomePage(RemoteWebDriver driver) {
              this.driver = driver;
        //verifyTitle("Book Bus Travels, AC Volvo Bus, Hotels & Bus Hire - redBus");
        takeSnap();
        System.out.println("1: "+driver.getTitle());
       }
 
 
 
 
 
      
       public RedbusHomePage enterFromPlace(String text) throws InterruptedException {
              enterByXpath(prop.getProperty("HomePage.FromPlace.textbox.xpath"), text);
              waitByXpath(prop.getProperty("HomePage.FromPlace.autofill.xpath"));
           clickByXpath(prop.getProperty("HomePage.FromPlace.autofill.xpath"));
              return this;
       }     
      
       public RedbusHomePage enterToPlace(String text) throws InterruptedException {
              clickByXpath(prop.getProperty("HomePage.ToPlace.textbox.xpath"));
              enterByXpath(prop.getProperty("HomePage.ToPlace.textbox.xpath"), text);
              waitByXpath(prop.getProperty("HomePage.ToPlace.autofill.xpath"));
           clickByXpath(prop.getProperty("HomePage.ToPlace.autofill.xpath"));
              return this;
       }
      
       public RedbusHomePage enterFromDate(String Expected_Month, String Expected_Date) throws InterruptedException {
              clickByXpath(prop.getProperty("HomePage.FromDate.textbox.xpath"));
              waitByXpath(prop.getProperty("HomePage.FromDate.calendar.month.xpath"));
       selectMonth(prop.getProperty("HomePage.FromDate.calendar.month.xpath"),prop.getProperty("HomePage.FromDate.calendar.navigation.xpath"), Expected_Month);
              selectDate(prop.getProperty("HomePage.FromDate.calendar.day.xpath"), Expected_Date);
              return this;
       }
      
       public SeatBookingPage clickSearchButton() throws InterruptedException {
              clickByXpath(prop.getProperty("HomePage.searchbuses.xpath"));
              return new SeatBookingPage(driver);
       }
      
}
 
 
 