package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Topic_00_Format {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        // Ham nay dung de mo max mize browser
        driver.manage().window().maximize();
    }
    @AfterClass
    public void afterClass() {
        // Ham nay de dong browser khi chay xong testcase
        driver.quit();
    }

    @Test
    public void Testcase_01(){
        // Ham nay dung de truyen url muon truy cap
        driver.get("nhap url muon mo tai day");

        // Ham nay dung de tim kiem locator cua element
        driver.findElement(By.xpath(""));
    }

}
