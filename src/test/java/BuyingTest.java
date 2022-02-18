import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BuyingTest {

    public WebDriver driver;
    public String testURL = "http://www.google.com";
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\Games\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.navigate().to(testURL);
    }
    @Test
    public void addingItemstoCart() throws InterruptedException {
        driver.manage().window().maximize();
        //agreement on terms and services
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("links");
        searchTextBox.submit();
        Thread.sleep(5000);

        WebElement linksPage = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div/div/div/div/div/a/h3"));
        linksPage.click();

        Thread.sleep(3000);

        WebElement cookie = driver.findElement(By.xpath("//button[@id=\"eu-cookie-ok\"]"));
        cookie.click();

        Thread.sleep(1000);

        WebElement searchBar =driver.findElement(By.name("q"));
        searchBar.sendKeys("tipkovnica");
        searchBar.submit();
        Thread.sleep(3000);

        WebElement keyboard = driver.findElement(By.xpath("//*[@data-productid=\"107576\"]/div/button"));
        keyboard.click();
        Thread.sleep(1000);

        WebElement searchBar2 = driver.findElement(By.name("q"));
        searchBar2.sendKeys("miš");
        searchBar2.submit();
        Thread.sleep(3000);

        WebElement mouse = driver.findElement(By.xpath("//button[@data-productid=\"109036\"]"));
        mouse.click();

        WebElement basketOfItems = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/div/span/span"));
        basketOfItems.click();
        Thread.sleep(1000);

        WebElement finishBuying = driver.findElement(By.xpath("//*[@id=\"checkout\"]/span"));
        finishBuying.click();
        Thread.sleep(1000);





    }
    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}

