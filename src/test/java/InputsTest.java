import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest {

    WebDriver driver;

    @Test
    public void inputTest() {

        // Установить системную переменную
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Открыть сайт
        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("9");
        input.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(input.getAttribute("value"), "10");
        input.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(input.getAttribute("value"), "9");
    }
}
