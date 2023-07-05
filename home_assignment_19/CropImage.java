package home_assignment_19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class CropImage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C://Users//jovan//IdeaProjects//ChromeDriver//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crop-circle.imageonline.co/");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0, 700)");

        File image = new File(
                "C://Users//jovan//IdeaProjects//selenium-day-2-second-try//src//main//java//Examples//Images//img.png");
        WebElement uploadBtn = driver.findElement(By.id("inputImage"));
        uploadBtn.sendKeys(image.getAbsolutePath());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement cropCircleBtn = driver.findElement(By.id("photobutton"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("photobutton")));
        cropCircleBtn.click();

        Thread.sleep(3000);

        WebElement downloadBtn = driver.findElement(By.id("download"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("download")));
        downloadBtn.click();

        Thread.sleep(3000);

        driver.close();
    }
}