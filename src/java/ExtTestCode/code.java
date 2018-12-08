package ExtTestCode;


import ExtCode.ExtCode;
import Runner.Runner;
import Selenium.ExtendTesboDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class code extends ExtendTesboDriver{
    public code(WebDriver driver) {
        super(driver);
    }



    @ExtCode("Search books")
    public void searchBooks() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isDisplayed());
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("books");
    }

}
