package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {



   static String htmlReport;
   static ExtentReports extent;
   static ExtentTest testreport;


    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayatri\\Downloads\\chromedriver_win32\\chromedriver.exe");

//Generate extentreport



        myfirsttest();




    }







    public static void  myfirsttest(){



        System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayatri\\Downloads\\chromedriver_win32\\chromedriver.exe");

//Generate extentreport


        ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extentReports.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReport);
        ExtentTest testreport = extent.createTest("my first report for google");

        ////////////////////////////////////////////

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // driver.manage().window().wait(10000);
        driver.get("https://www.google.co.in/");
        driver.findElement(By.name("q")).sendKeys("Automation");

        testreport.pass("starting");




    }



    public  static void endtest()
    {
        extent.flush();


    }



}