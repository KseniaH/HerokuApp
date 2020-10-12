import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxesTests {

    WebDriver driver;

    @Test
    public void checkboxesTest() {

        // Установить системную переменную
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Открыть сайт
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        // проверить, что первый чекбокс unchecked, отметить первый чекбокс, проверить что он checked

        List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
        assertFalse(checkboxes.get(0).isSelected(), "First Checkbox is not checked");
        checkboxes.get(0).click();
        assertTrue(checkboxes.get(0).isSelected(), "First Checkbox is checked");

        // Проверить, что второй чекбокс checked, сделать unheck, проверить, что он unchecked
        assertTrue(checkboxes.get(1).isSelected(), "Second Checkbox is checked");
        checkboxes.get(1).click();
        assertFalse(checkboxes.get(1).isSelected(), "Second Checkbox is not checked");
    }
}