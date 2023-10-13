import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NatureTechGalleryPageTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vas\\Downloads\\chromedriver-win32\\chromedriver-win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://qanaturegallery.ccbp.tech/");

        WebElement headingEl = driver.findElement(By.tagName("h1"));
        System.out.println(headingEl.getText());

        for (int i=0; i<3; i++){
            driver.switchTo().frame(i);
            headingEl = driver.findElement(By.tagName("h2"));
            System.out.println(headingEl.getText());

            WebElement paraText = driver.findElement(By.tagName("p"));
            System.out.println(paraText.getText());

            driver.switchTo().defaultContent();
        }
        driver.quit();

    }
}
