package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private String A= null;
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
