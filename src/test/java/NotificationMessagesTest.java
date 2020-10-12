import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotificationMessagesTest {

    WebDriver driver;

    @Test
    public void notificationTest() {

        // Установить системную переменную
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Открыть сайт
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");


        driver.findElement(By.linkText("Click here")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class='flash notice']")).getText(), "Action unsuccesful, please try again\n×");
        driver.findElement(By.linkText("Click here")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class='flash notice']")).getText(), "Action succesful×");
    }
}


