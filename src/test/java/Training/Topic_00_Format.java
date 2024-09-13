package Training;

import commons.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Topic_00_Format extends BaseTest {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = getBrowserDriver("chrome");

        // Ham nay dung de truyen url muon truy cap
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
    }
    @AfterClass
    public void afterClass() {
        // Ham nay de dong browser khi chay xong testcase
        driver.quit();
    }

    @Test
    public void Testcase_01(){
        // Ham nay dung de tim kiem locator cua element va get Text cua element do = code .getText()
        String actualText = driver.findElement(By.xpath("//div[@class='field_link']")).getText();
        System.out.println("text là: " + actualText);

        String expectedText = "Tôi đồng ý với các chính sách và thỏa thuận sử dụng của Alada.vn";

        // Ham nay de so sanh 2 text = nhau giua actual result va expected result
        Assert.assertEquals(actualText, expectedText);
    }

}
