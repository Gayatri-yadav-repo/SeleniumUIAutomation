package org.example;

import com.aventstack.extentreports.utils.FileUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class paymentpage {



    public static void main (String args[]) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayatri\\Downloads\\chromedriver_win32\\chromedriver.exe");
        example();
    }
    public  static void  example () throws IOException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // driver.manage().window().wait(10000);
        driver.get("https://www.spicejet.com/");

//        driver.findElement(By.xpath("//div[@class =\"css-1dbjc4n r-1jkjb\"]/div")).click();
//        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("myname is grv");
//      //  driver.findElement(By.xpath("//div[@data-testid=\"user-country-code-selection\"]")).click();
//
//        driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9538901991");
//        driver.findElement(By.xpath("//div[@data-testid=\"login-cta\"]")).click();
//  driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[3]/div[2]/div/a/div")).click();

           // driver.navigate().to("https://spiceclub.spicejet.com/signup");
          //  driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).click();
            driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
            driver.findElement(By.xpath("(//div[contains(text(),'Ahmedabad')])[1]")).click();
            driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
                    ;
            driver.findElement(By.xpath(" //div[contains(text(),'Amritsar')]")).click();
            driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[14]")).click();
            driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();

            // TakeScreenshot

        TakesScreenshot src = (TakesScreenshot)driver;
        File src1= src.getScreenshotAs(OutputType.FILE);
            File des = new File("path ");

        FileUtils.copyFile(src1,des);






//        (//*[local-name()='svg'])[@height="16"]
//                (//*[local-name()='svg'])[@height="16"]
//
//
}
}
