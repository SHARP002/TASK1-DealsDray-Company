package UI;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UiTesting2 {

	public static void main(String[] args) throws Throwable
	{

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.getcalley.com/");
	    TakesScreenshot imgs = (TakesScreenshot)driver;
		File paths = new File("./Screenshot/1536×864.png");
		File img = imgs.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(img,paths); 
		Thread.sleep(3000);
		driver.quit();

	}

}
