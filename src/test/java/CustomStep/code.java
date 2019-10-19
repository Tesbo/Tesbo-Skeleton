package CustomStep;


import Selenium.ExtendTesboDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reportAPI.Reporter;


public class code extends ExtendTesboDriver{
    public code(WebDriver driver) {
        super(driver);
    }
    Reporter reporter=new Reporter();

    @Step("Verify profile page title")
    public void VerifyProfilepageTitle() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Profile')]")).isDisplayed());
        reporter.printStep("Profile page title is displayed!!!");
    }

    @Step("Click on account button")
    public void ClickOnAccountButton() {
        driver.findElement(By.xpath("(//a[contains(text(),'Account')])[2]")).click();
    }

    @Step("Enter credential")
    public void EnterCredential(String email, String password) {
        driver.findElement(By.xpath("//INPUT[@type='text']")).sendKeys(email);
        driver.findElement(By.xpath("//INPUT[@type='password']")).sendKeys(password);
    }
}
