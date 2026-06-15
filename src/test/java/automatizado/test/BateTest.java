package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BateTest {
    
    protected static WebDriver driver;
    private static final String URL_BASE = "http://127.0.0.1:5500/login.html";

    @BeforeClass
    public static void iniciar(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    
    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}
