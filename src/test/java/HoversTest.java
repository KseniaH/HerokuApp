import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HoversTest {

    WebDriver driver;

    @Test
    public void hoverTest() {

        // Установить системную переменную
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Открыть сайт
        driver.get("http://the-internet.herokuapp.com/hovers");

        // Сделать цепочку из действий: наведение на профиль, проверка имени, клик по ссылке,
        // проверка 404 ошибки. Повторить для каждого из профилей


        WebElement image = driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
        Actions action = new Actions(driver);
        action.moveToElement(image).perform();


        WebElement user = driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > div > h5"));
        String actualResult = user.getText();
        Assert.assertEquals(actualResult, "name: user1");

        WebElement link = driver.findElement(By.linkText("View profile"));
        action.moveToElement(link).click().perform();

        WebElement text = driver.findElement(By.tagName("h1"));
        String actualResult1 = text.getText();
        Assert.assertEquals(actualResult1, "Not Found");


    }
}
