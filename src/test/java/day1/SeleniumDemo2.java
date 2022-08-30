package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mvlajic\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement username=driver.findElement(By.id("user-name"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.name("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();

        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
        Thread.sleep(2000);

        if(driver.findElements(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).size() != 0){
            System.out.println("Title Sauce Labs Backpack is Present");
        }else{
            System.out.println("Title Sauce Labs Backpack is Absent");
        }

        if(driver.findElements(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[2]")).size() != 0){
            System.out.println("Description of Item is Present");
        }else{
            System.out.println("Description of Item is Absent");
        }

        if(driver.findElements(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")).size() != 0){
            System.out.println("Price of Item is Present");
        }else{
            System.out.println("Price of Item is Absent");
        }

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.id("first-name"));
        WebElement lastName=driver.findElement(By.id("last-name"));
        WebElement postalCode=driver.findElement(By.id("postal-code"));

        firstName.sendKeys("milos");
        lastName.sendKeys("vlajic");
        postalCode.sendKeys("11000");

        WebElement shoppingButton=driver.findElement(By.name("continue"));
        shoppingButton.click();

        WebElement finishButton=driver.findElement(By.name("finish"));
        finishButton.click();

        WebElement thankYou=driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        String expected= "THANK YOU FOR YOUR ORDER";
        String actual = thankYou.getText();

        if(actual.equals(expected)){
            System.out.println("Message is displayed");
        }else{
            System.out.println("Message isn't displayde");
        }
        Thread.sleep(2000);

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
        btn.click();
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));

        logout.click();



    }
}
