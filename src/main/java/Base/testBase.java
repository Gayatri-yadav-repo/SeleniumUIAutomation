package Base;

import Util.Testutils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class testBase {

    public static WebDriver driver ;
    public static Properties prop;
    public static  FileInputStream ip;


    public testBase()  {

        try {
            prop = new Properties();
            ip = new FileInputStream("C:\\Users\\Gayatri\\IdeaProjects\\Selenium\\SeleniumQA\\src\\main\\java\\Config\\config.properties");

            prop.load(ip);
        }
        catch (Exception e) {
            e.printStackTrace();

        }


    }


    public static void initialization(){

        String browsername = prop.getProperty("browser");
        if(browsername.equals("chrome")){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayatri\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout( Testutils.page_load_timeout, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Testutils.implicit_wait,TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));
           String titlename =  driver.getTitle();
           System.out.println("titlename is "+titlename);


        }

    }
}
