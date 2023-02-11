package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathdetails {

    public static void main (String [] args){


        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // driver.manage().window().wait(10000);
        driver.get("https://www.spicejet.com/");



    }
      public static void spathdetails1(){


      }


}
