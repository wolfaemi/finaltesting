package autotitle;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class automated {
    ;

    @Test
    public void testNGAsserts() throws Exception{
        //To Open with Edge Driver
        System.setProperty("webdriver.edge.driver", "C://Users//localadmin//Downloads//msedgedriver.exe");
        EdgeDriver Driver = new EdgeDriver();

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.gmail.com");
        String actualTitle = "Gmail";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(2000);
    }

}
