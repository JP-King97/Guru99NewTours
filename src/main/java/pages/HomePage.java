package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.io.FileDescriptor.getHandle;

public class HomePage {

    private WebDriver driver;
    private By loginButton = By.xpath("//span[@class=\"fa-user\"]");


    public HomePage(WebDriver webDriver){
        this.driver = driver;
    }

     //  public void clickLoginButton(){
     //      String parentHandle = getHandle();
     //      driver.findElement(loginButton).click();
     //      // closingAtTab().closeAdTab(parentHandle,"animeflv");
     //  }
}
