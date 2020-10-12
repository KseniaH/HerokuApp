import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class DropDownTest {

    WebDriver driver;

    @Test
    public void dropDownTest() {

        // Установить системную переменную
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Открыть сайт
        driver.get("http://the-internet.herokuapp.com/dropdown");


        // Взять все элементы дроп-дауна и проверить их наличие

        Select select = new Select(driver.findElement(By.id("dropdown")));

        assertEquals(select.getOptions().size(), 3, "3 options");
        select.selectByValue("1");
        assertTrue(select.getFirstSelectedOption().isSelected(), "Option 1");
        select.selectByValue("2");
        assertTrue(select.getFirstSelectedOption().isSelected(), "Option 2");

    }
}

