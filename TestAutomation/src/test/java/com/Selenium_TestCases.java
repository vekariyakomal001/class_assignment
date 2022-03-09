package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;


import static org.openqa.selenium.devtools.v85.debugger.Debugger.pause;

public class Selenium_TestCases {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();// Maximize window

        driver.get("https://omayo.blogspot.com/"); // Open Main URL

        driver.findElement(By.xpath("//span[@id='home']")); // Click on Home Menu

        Select car_dropdown = new Select(driver.findElement(By.id("multiselect1"))); // Select multiple values from dropdownbox
        car_dropdown.selectByVisibleText("Hyundai"); // 1 value fetch by text
        car_dropdown.selectByIndex(1); // value fetch by index
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Select Newsletters = new Select(driver.findElement(By.xpath("//select[@id='drop1']"))); // By using xpath select value from dropdown
        Newsletters.selectByValue("ghi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Below code is for clicking on link
        //Here, I put this code in comments because after clicking on link,
        // it is opening that link in new window but again it is not navigating on main URL
        /*WebElement Selenium143_link1 = driver.findElement(By.xpath("//a[@href='http://www.Selenium143.blogspot.com']"));
        Selenium143_link1.click();
        driver.get("https://omayo.blogspot.com/");
        driver.navigate().to("https://omayo.blogspot.com/");*/

        WebElement preload_text = driver.findElement(By.xpath("//input[@value='Selenium WebDriver']"));// Element find by using xpath
        String text_value = preload_text.getAttribute("value");// Get value of textbox
        System.out.println(text_value);// Print text
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //To scroll page down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");

        //This is also a link, which is opening in new window as like previous one
        /*WebElement SeleniumTutorial_link = driver.findElement(By.xpath("//a[@href='http://www.Selenium143.blogspot.com']"));
        SeleniumTutorial_link.click();*/

        WebElement button2 = driver.findElement(By.xpath("//button[@id='but2']"));// Fetch Element
        button2.click();//Click on button
        String button2_text = driver.findElement(By.xpath("//button[@id='but2']")).getText();// Get the text of button
        System.out.println(button2_text + " Clicked");// Print Message for button clicking event
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Click on Login, Register and Submit Button
        WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
        submit.click();
        String submit_text = driver.findElement(By.xpath("//button[text()='Submit']")).getText();
        System.out.println(submit_text + " Button Clicked");
        WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
        login.click();
        String login_text = driver.findElement(By.xpath("//button[text()='Login']")).getText();
        System.out.println(login_text + " Button Clicked");
        WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
        register.click();
        String register_text = driver.findElement(By.xpath("//button[text()='Register']")).getText();
        System.out.println(register_text + " Button Clicked");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,800)"); // Scroll Down Page

        WebElement click_after_dissapperar = driver.findElement(By.xpath("//input[@id='alert2']")); //fetch element
        click_after_dissapperar.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement upload_file = driver.findElement(By.xpath("//input[@name='anyfile']"));
        upload_file.sendKeys("C://DumpStack.log");
        upload_file.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
