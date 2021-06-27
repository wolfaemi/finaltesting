package autotitle;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
public class Images {
    public Images() {
    }
    @BeforeClass
    void setUpClass() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\localadmin\\Downloads\\msedgedriver.exe");
    }

    @Test
    public void imagess() throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://thedemosite.co.uk/");
        List<WebElement> listImages = driver.findElements(By.tagName("img"));
        int figures = 0;
        Iterator var5 = listImages.iterator();

        while(var5.hasNext()) {
            WebElement image = (WebElement)var5.next();
            if (image.isDisplayed()) {
                ++figures;
            }
        }

        System.out.println("No. of total displayed images: " + figures);
        driver.close();
    }

    @Test
    public void buttons() throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://thedemosite.co.uk/");
        List<WebElement> listButtons = driver.findElements(By.tagName("button"));
        int counts = 0;
        Iterator var5 = listButtons.iterator();

        while(var5.hasNext()) {
            WebElement button = (WebElement)var5.next();
            if (button.getText().equals("buttonName")) {
                ++counts;
            }
        }

        System.out.println("No. of total displyed buttons: " + counts);
        driver.close();
    }
}
