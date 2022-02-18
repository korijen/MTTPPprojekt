import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class NBATest {

    public WebDriver driver;
    public String testURL = "http://www.google.com";
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\Games\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.navigate().to(testURL);
    }
    @Test
    public void searchforEspnTest() throws InterruptedException {
        driver.manage().window().maximize();
        //agreement on terms and services
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("espn");
        searchTextBox.submit();
        Thread.sleep(5000);

        WebElement espnPage = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div/div/div/div/div/a/h3"));
        espnPage.click();

        Thread.sleep(5000);

        //terms and conditions on espn site
        WebElement acceptButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
        acceptButton.click();






    }
    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}

