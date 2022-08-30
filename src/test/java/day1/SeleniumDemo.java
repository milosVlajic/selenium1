package day1;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mvlajic\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.name("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();

        if (driver.findElements(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).size() != 0) {
            System.out.println("Element Products is Present");
        } else {
            System.out.println("Element Products is Absent");
        }

        if (driver.findElements(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).size() != 0) {
            System.out.println("Element shopping cart is Present");
        } else {
            System.out.println("Element shopping cart is Absent");
        }

        if (driver.findElements(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).size() != 0) {
            System.out.println("Element burger menu is Present");
        } else {
            System.out.println("Element burger menu is Absent");
        }

        if (driver.findElements(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a")).size() != 0) {
            System.out.println("Element Twitter is Present");
        } else {
            System.out.println("Element Twitter is Absent");
        }

        if (driver.findElements(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a")).size() != 0) {
            System.out.println("Element Facebook is Present");
        } else {
            System.out.println("Element Facebook is Absent");
        }

        if (driver.findElements(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")).size() != 0) {
            System.out.println("Element Linkedin is Present");
        } else {
            System.out.println("Element Linkedin is Absent");
        }

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
        btn.click();
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        boolean logoutFind = logout.isDisplayed();
        if (logoutFind){
            System.out.println("Logout is find");
        }else{
            System.out.println("Logout isn't find");
        }



    }
}
