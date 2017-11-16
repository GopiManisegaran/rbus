package pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import wrappers.Redbus;
 
public class SeatBookingPage extends Redbus {
 
       public SeatBookingPage(RemoteWebDriver driver) {
              this.driver = driver;
        //verifyTitle("Search Bus Tickets");
              waitByXpath(prop.getProperty("SeatSelectionPage.viewSeatButton.xpath"));
        takeSnap();
        System.out.println("2: "+driver.getTitle());
       }
      
       public SeatBookingPage clickViewSeatButton() throws InterruptedException {
              waitByXpath(prop.getProperty("SeatSelectionPage.viewSeatButton.xpath"));
              clickByXpath(prop.getProperty("SeatSelectionPage.viewSeatButton.xpath"));
              return this;
       }     
      
       public SeatBookingPage selectSeat(String x, String y, String x1, String y1) throws InterruptedException {
              WebElement val= driver.findElement(By.xpath(prop.getProperty("SeatSelectionPage.seatCanvas.xpath")));
              moveToElementAndClick(val, x, y);
              scroll(x1, y1);
              return this;
       }
      
       public SeatBookingPage selectBoardingPoint() {
              waitByXpath(prop.getProperty("SeatSelectionPage.startJourney.xpath"));
              clickByXpath(prop.getProperty("SeatSelectionPage.startJourney.xpath"));
              return this;       
       }
      
       public SeatBookingPage selectDestinationPoint() {
              waitByXpath(prop.getProperty("SeatSelectionPage.destinationJourney.xpath"));
              clickByXpath(prop.getProperty("SeatSelectionPage.destinationJourney.xpath"));
              return this;
       }
      
       public PassengerDetailPage clickProceedButton() throws InterruptedException {
              clickByXpath(prop.getProperty("SeatSelectionPage.proceedButton.xpath"));
              return new PassengerDetailPage(driver);
       }
}
 
 