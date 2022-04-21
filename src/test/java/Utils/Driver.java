package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private WebDriver driver;

    public Driver(){}

    public WebDriver getDriver(String driverName){

        if(driver==null){
            switch (driverName){
                case"chromeGrid":
                    String url="http://34.216.248.119:4444";
                    File file = new File("C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
                    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                    DesiredCapabilities desiredCapabilities= DesiredCapabilities.chrome();
                    desiredCapabilities.setBrowserName("chrome");
                    desiredCapabilities.setPlatform(Platform.ANY);
                    try {
                        driver = new RemoteWebDriver(new URL(url), desiredCapabilities);
                    }catch (MalformedURLException m){
                        m.printStackTrace();
                    }
                    break;


                case "chrome":
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
            }
        }
        driver.manage().window().maximize();

        return driver;
    }

}
