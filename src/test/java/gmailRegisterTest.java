import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class gmailRegisterTest {

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
        Thread.sleep(2000);

        WebElement cookieBar = driver.findElement(By.xpath("//a[@role=\"button\"]"));
        cookieBar.click();
        Thread.sleep(1000);

        WebElement signIn = driver.findElement(By.xpath("//*[@data-action=\"sign in\"]"));
        signIn.click();
        Thread.sleep(1500);



        WebElement signUp = driver.findElement(By.xpath("//*[@jsname=\"WjL7X\"]/div/button"));
        signUp.click();
        Thread.sleep(1000);

        WebElement forMe = driver.findElement(By.xpath("//*[@jsname=\"RZzeR\"]"));
        forMe.click();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Bruno");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Pandža");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.id("username"));
        email.click();
        email.sendKeys("mttpptestiranje");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.name("Passwd"));
        password.click();
        password.sendKeys("sifra1234");
        Thread.sleep(1000);

        WebElement confirmPassword = driver.findElement(By.name("ConfirmPasswd"));
        confirmPassword.click();
        confirmPassword.sendKeys("sifra1234");
        Thread.sleep(1000);

        WebElement btnNext = driver.findElement(By.xpath("//*[@jsname=\"LgbsSe\"]"));
        btnNext.click();
        Thread.sleep(1000);

        WebElement telephon = driver.findElement(By.id("phoneNumberId"));
        telephon.sendKeys("0954392112");
        Thread.sleep(1000);

        WebElement btnNext2 = driver.findElement(By.xpath("//*[@jsname=\"LgbsSe\"]"));
        btnNext2.click();
        Thread.sleep(1000);








    }
    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}

