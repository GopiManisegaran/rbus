package pages;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import wrappers.Redbus;
 
public class PaymentPage extends Redbus {
       public PaymentPage(RemoteWebDriver driver) {
              this.driver = driver;
        //verifyTitle("4: "+driver.getTitle());
        takeSnap();
              System.out.println("4: "+driver.getTitle());
       }
      
       public PaymentPage Verification(String tag) {
              waitByClassName(prop.getProperty("PaymentPage.details.classname"));
              selectByTagNameFromElement(prop.getProperty("PaymentPage.details.classname"), tag);
              takeSnap();
        return this;
       }
      
 
}
 