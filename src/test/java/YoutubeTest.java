import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class YoutubeTest {

    public WebDriver driver;
    public String testURL = "http://www.google.com";
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\Games\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.navigate().to(testURL);
    }
    @Test
    public void babysharkTest() throws InterruptedException {
        driver.manage().window().maximize();
        //agreement on terms and services
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("youtube");
        searchTextBox.submit();
        Thread.sleep(5000);

        WebElement youtubePage = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div/table/tbody/tr/td/div/h3/a"));
        youtubePage.click();
        Thread.sleep(5000);

        //youtube cookies

        WebElement ytCookies = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/ytd-button-renderer/a/tp-yt-paper-button/yt-formatted-string"));
        ytCookies.click();
        Thread.sleep(2000);

        WebElement searchCustomization = driver.findElement(By.xpath("//*[@jsname=\"vaX9ac\"]"));
        searchCustomization.click();

        WebElement ytHistory = driver.findElement(By.xpath("//*[@jsname=\"lW531d\"]"));
        ytHistory.click();

        WebElement adPersonalization = driver.findElement(By.xpath("//*[@jsname=\"Vosabd\"]"));
        adPersonalization.click();



        //yt consent
        WebElement ytConsent = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div/form/div/button/span"));
        ytConsent.click();
        Thread.sleep(3000);


        WebElement ytSearchBox = driver.findElement(By.name("search_query"));
        ytSearchBox.sendKeys("baby shark");
        ytSearchBox.submit();
        Thread.sleep(3000);


        WebElement thumbnail = driver.findElement(By.xpath("//*[@id=\"title-wrapper\"]/h3/a/yt-formatted-string"));
        thumbnail.click();
        Thread.sleep(3000);

    }
    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}

