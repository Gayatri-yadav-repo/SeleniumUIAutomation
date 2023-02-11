package TestCases;

import Base.testBase;
import Pages.homePage;
import Pages.loginpage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpageTest extends testBase {

public loginpage loginpage ;
    public  homePage homePage;


    loginpageTest(){
        super();
    }

    @BeforeMethod
    public void setup () {

     initialization ();
         loginpage = new loginpage();

}

@Test(priority = 1)
public void loginpageTitle(){

         String title = loginpage.titlepage();
    Assert.assertEquals(title,"SpiceClub - The frequent flyer program of SpiceJet");

}

@Test(priority = 2)
public void validatelogoimag()
{
   boolean flag = loginpage.validatespicylogo();
   Assert.assertTrue(flag);
}

@Test(priority = 3)
public void validatelogin() {


    homePage=   loginpage.login(prop.getProperty("password"), prop.getProperty("MobileNumber"));



}

@AfterMethod
    public void tearDown()
{
    driver.quit();
}
}
