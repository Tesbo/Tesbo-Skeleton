package ExtTestCode;


import ExtCode.ExtCode;
import Runner.Runner;
import Selenium.ExtendTesboDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class code extends ExtendTesboDriver{
    public code(WebDriver driver) {
        super(driver);
    }



    @ExtCode("Search books")
    public void searchBooks() {


        driver.findElement(By.xpath("(//div[contains(text(),'24')])[2]")).click();



    }

}
