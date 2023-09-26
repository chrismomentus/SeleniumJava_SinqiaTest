import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase01 {
	@Test
	
	public void testcase() {
		
		// TODO Auto-generated method stub
				String textoDefinido = "AgiBank text";
				
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				WebDriver driver=new ChromeDriver(options);
				
				driver.navigate().to("https://blogdoagi.com.br/");
				
				driver.findElement(By.id("search-open")).click();
				
				driver.findElement(By.className("search-field")).sendKeys(textoDefinido);
				
				driver.findElement(By.className("search-submit")).click();
		        
		        String actualText = driver.findElement(By.className("archive-title")).getText();  
		        
		        assertTrue(actualText.contains(textoDefinido));

	}

}
