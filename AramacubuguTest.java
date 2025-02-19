import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




    import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
    public class AramacubuguTest {
        private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;
        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
        }
        @After
        public void tearDown() {
            driver.quit();
        }
        @Test
        public void AramacubuguTest() {
            driver.get("https://dolap.com/");
            driver.manage().window().setSize(new Dimension(1054, 816));
            Arrays.asList(By.cssSelector(".fancybox-item").findElement(driver),
                    driver.findElement(By.id("search"))).forEach(WebElement::click);
            driver.findElement(By.id("search")).sendKeys("gözlük");
            driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
            {
                List<WebElement> elements = driver.findElements(By.cssSelector(".breadcrumb > li:nth-child(4)"));
                assert(elements.size() > 0);
            }
        }
    }


