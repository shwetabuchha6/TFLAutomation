package StepDef;


import ObjectRepo.CookieWindow_PageObject;
import ObjectRepo.Journeyresults_PageObject;
import ObjectRepo.planaJourney_PageObject;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
 public static planaJourney_PageObject planjourney_repo;
 public static CookieWindow_PageObject cookie_repo;
 public static Journeyresults_PageObject journey_repo;



    public static void driverintialization() throws IOException {

       Properties prop = new Properties();
       String configpath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
       InputStream input = new FileInputStream(configpath);
       prop.load(input);

        String browser = prop.getProperty("Browser");


        switch (browser) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;

            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
        }
          driver.get(prop.getProperty("URL"));

    }


   public static void driverpreReq() throws IOException {
        driverintialization();
       planjourney_repo = new planaJourney_PageObject(driver);
       cookie_repo = new CookieWindow_PageObject(driver);
       journey_repo = new Journeyresults_PageObject(driver);

    }

    @After
    public void close_browser(){
     //   driver.close();
    }

    }
