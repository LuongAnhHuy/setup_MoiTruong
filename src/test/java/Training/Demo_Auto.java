package Training;

import commons.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Demo_Auto extends BaseTest {
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver = getBrowserDriver("chrome");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void Testcase_01() {
        driver.get("https://material.playwrightvn.com/021-import-export.html");

        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Phạm Thị D");
        driver.findElement(By.xpath("//button[@id='searchButton']")).click();
        List<WebElement> rowDisplays = driver.findElements(By.xpath("//tbody//tr[not(@style)]"));
        List<WebElement> nameColumn = driver.findElements(By.xpath("//tbody//tr[not(@style)]//td"));
        System.out.println("So row visible la: " + rowDisplays.size());
        ArrayList<String> name = new ArrayList<>();
        if (rowDisplays.size() == 1) {
            Assert.assertEquals(rowDisplays.size(), 1);
            for (int i = 0; i <nameColumn.size(); i++) {
                name.add(nameColumn.get(i).getText());
            }
            System.out.println(name);
            Assert.assertEquals(name.get(1), "Phạm Thị D");
        } else {
            System.out.println("Verify thất bại. Số học sinh trong lớp A4 không phải là 1.");
        }


//        for (int i = 0; i < nameColumn.size(); i++) {
//            name.add(nameColumn.get(i).getText());
//            System.out.println("Name: " + name);
//        }
//        ArrayList<String> name = new ArrayList<>();
//        for (int i = 0; i < nameColumn.size(); i++) {
//            }

//            name.add(nameColumn.get(i).getText());
//            System.out.println("Name:" + name);
    }
}
