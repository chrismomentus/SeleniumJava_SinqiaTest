
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCases {
	
	@Test

	public void TestCase02() {
		
		String textoInvalido = "@#$%&*";
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		
		driver.navigate().to("https://blogdoagi.com.br/");
		
		driver.findElement(By.id("search-open")).click();
		
		driver.findElement(By.className("search-field")).sendKeys(textoInvalido);
		
		driver.findElement(By.className("search-submit")).click();        
        
        Assert.assertEquals("Nenhum resultado",driver.findElement(By.className("entry-title")).getText()); 

	}
}
