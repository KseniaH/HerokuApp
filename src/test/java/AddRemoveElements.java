import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class AddRemoveElements {

    WebDriver driver;

    @Test
    public void addRemoveTest() {

        // Установить системную переменную
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Открыть сайт
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add 2 Elements
        WebElement addElement = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        addElement.click();
        addElement.click();

        //  Remove elements
        List <WebElement> deleteElement = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        deleteElement.get(0).click();
    }
}
