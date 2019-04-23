package ExtTestCode;


import ExtCode.ExtCode;
import Selenium.ExtendTesboDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



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
