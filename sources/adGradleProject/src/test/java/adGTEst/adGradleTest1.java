package adGTEst;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adGradleTest1 {

    private WebDriver driver;
    private WebDriverWait wait;


    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\java_projects\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void adGradleTest1() {
        driver.get("https://www.edvantis.com/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Custom Software Developement | Edvantis | IT Outsourcing Provider"));
    }

    @After
    public  void  stop() {
        driver.quit();
        driver = null;
    }
}
