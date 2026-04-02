package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class loginTest1 {

    WebDriver driver;

    @Test

    public void loginTest1Tests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");//home page
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();//login page
        driver.findElement(By.id("login-email")).sendKeys("sherley@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[3]/div[1]/div[1]/h3")).isDisplayed();
        Thread.sleep(1000);
        //Dashboard Page
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("Bokang");
        driver.findElement(By.id("email")).sendKeys("bokang@test.com");
        driver.findElement(By.id("age")).sendKeys("20");
        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"experience\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[2]/div/label[5]")).click();
        driver.findElement(By.id("comments")).sendKeys("Testing is Ndosi Website");
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[3]/label[2]")).click();
        driver.findElement(By.id("submit-btn")).click();
        driver.findElement(By.xpath("//*[@id=\"practice-section\"]/div[3]/div")).isDisplayed();
        Thread.sleep(4000);
        driver.findElement(By.id("submissions-toggle-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("view-submission-0")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
