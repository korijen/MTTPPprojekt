import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class gmailLogin {

    public WebDriver driver;
    public String testURL = "http://www.google.com";
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\Games\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.navigate().to(testURL);
    }
    @Test
    public void gmailLog() throws InterruptedException {
        driver.manage().window().maximize();
        //agreement on terms and services
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();



        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("gmail");
        searchTextBox.submit();
        Thread.sleep(2000);

        WebElement gmailPage = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div/div/div/div/div/a/h3"));
        gmailPage.click();

        Thread.sleep(3000);

        WebElement signIn = driver.findElement(By.xpath("//*[@data-action=\"sign in\"]"));
        signIn.click();
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//*[@jsname=\"YPqjbf\"]"));
        email.sendKeys("testzamttpp@gmail.com");
        WebElement buttonNextEmail = driver.findElement(By.xpath("//*[@jsname=\"LgbsSe\"]"));
        buttonNextEmail.click();
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//*[@jsname=\"YPqjbf\"]"));
        password.sendKeys("sifra1234");
        WebElement buttonNextPassword = driver.findElement(By.xpath("//*[@jsname=\"LgbsSe\"]"));
        buttonNextPassword.click();
        Thread.sleep(3000);




    }
    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}

