package adMaven1Script;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScriptTol {

    @Test
    public static void firstScriptTol () {

        System.setProperty("webdriver.chrome.driver", "C:\\java_projects\\tools\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.edvantis.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Custom Software Developement | Edvantis | IT Outsourcing Provider"));

        System.out.println("Hooray");

        driver.quit();
    }
}
