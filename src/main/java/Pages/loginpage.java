package Pages;

import Base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class loginpage extends testBase {

//page factory//or object repos


//
//     driver.findElement(By.xpath("//span [@class =\"d-none d-lg-block\"]")).click();
//        driver.findElement(By.xpath(   "//input[@type=\"password\"]"  )).sendKeys("myname is grv");
//        driver.findElement(By.xpath(   "//input[@type=\"tel\"]"    )     ).sendKeys("9538901991");
//        driver.findElement(By.xpath("//div[@class=\"btn btn-red plr-50\"]")).click();
//
//


    @FindBy(xpath = "//input[@type=\"tel\"]")
    WebElement MobileNumber;
  //  @FindBy(xpath = "//input[@id=\"last_name\"]")
@FindBy(xpath =  "//input[@type=\"password\"]" )
    WebElement Password;

    @FindBy(xpath = "//span[@class= \"d-none d-lg-block\"]")
    WebElement loginbutton;

    @FindBy(xpath = "//div[@id=\"react-root\"]/div/div/div/div/nav/div/div/a[2]/img")
    WebElement spicylogo;


    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    WebElement signup;

    //Initialization
    public loginpage(){

        PageFactory.initElements(driver, this);
    }
//Action
    public String titlepage()
    {
        return driver.getTitle();
    }

    public boolean validatespicylogo()
    {
        return spicylogo.isDisplayed();
    }

    public homePage login(String password, String mobile)
    {
        loginbutton.click();
///input[@class="form-control"and @type="password"]





        Password.sendKeys(password);
        MobileNumber.sendKeys(mobile);

        return new homePage();


    }

}