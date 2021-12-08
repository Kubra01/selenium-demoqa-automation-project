import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {

    WebDriver driver ;
    static String browser;

    static {
        browser = System.getProperty( "browser" );
    }

    @BeforeAll
    public static void setUp(){
        if (Objects.equals( browser, "firefox" )){
            WebDriverManager.firefoxdriver().setup();
        }else if(Objects.equals( browser, "chrome" )){
            WebDriverManager.chromedriver().setup();
        }
        System.out.println("Test initiated.");
    }

    @BeforeEach
    public void beforeMethod(){

        driver = getDriver(browser);
    }

    @AfterEach
    public void afterMethod(){
        driver.quit();
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Test finished.");
    }

    private WebDriver getDriver(String browser){
        if (Objects.equals( browser, "firefox" )){
            driver = new FirefoxDriver();
        }else if(Objects.equals( browser, "chrome" )){
            driver = new ChromeDriver();
        }
        return driver ;
    }





}