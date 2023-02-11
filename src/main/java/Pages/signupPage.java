package Pages;

import Base.testBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signupPage extends testBase {



    @FindBy(xpath="//input[@id=\"first_name\"]") WebElement Firstname;
    @FindBy(xpath="//input[@id=\"last_name\"]") WebElement Lastname;
    @FindBy(xpath="//select[@id=\"\"]") WebElement Residence;
    @FindBy(xpath="") WebElement calendar;


}
