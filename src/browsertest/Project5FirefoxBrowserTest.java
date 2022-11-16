package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project5FirefoxBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe"); //("key","path");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);


        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());

        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("testing123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("test1234");

        driver.quit();


    }
}