package pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import wrappers.Redbus;
 
public class PassengerDetailPage extends Redbus{
       public PassengerDetailPage(RemoteWebDriver driver) {
              this.driver = driver;
        //verifyTitle("Search Bus Tickets");
        takeSnap();
        System.out.println("3: "+driver.getTitle());
       }
      
       public PassengerDetailPage enterMailId(String mail) {
              enterByXpath(prop.getProperty("DetailsPage.mail.xpath"), mail);
              return this;
       }
      
       public PassengerDetailPage enterPhoneNO(String no) {
              enterByXpath(prop.getProperty("DetailsPage.phone.xpath"), no);
              return this;
       }
      
       public PassengerDetailPage enterName(String name) {
              waitByXpath(prop.getProperty("DetailsPage.name.xpath"));
              enterByXpath(prop.getProperty("DetailsPage.name.xpath"), name);
              return this;
       }
      
       public PassengerDetailPage selectGender(String gender) {
              selectGender(prop.getProperty("DetailsPage.gender.classname"), gender);
              return this;
       }
      
       public PassengerDetailPage enterAge(String age) {
              enterByXpath(prop.getProperty("DetailsPage.age.xpath"), age);
              return this;
       }
      
       public PaymentPage clickProceed() throws InterruptedException {
        clickByXpath(prop.getProperty("DetailsPage.proceedToPay.xpath"));
              return new PaymentPage(driver);
       }
 
}
 

 