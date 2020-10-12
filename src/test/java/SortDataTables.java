import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortDataTables {

    WebDriver driver;

    @Test
    public void sortDataTablesTest() {

        // Установить системную переменную
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Открыть сайт
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement cell1 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]"));
        WebElement cell2 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[2]"));
        WebElement cell3 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[3]"));


        assertEquals(cell1.getText(), "Smith");
        assertEquals(cell2.getText(), "John");
        assertEquals(cell3.getText(), "jsmith@gmail.com");


    }
}
