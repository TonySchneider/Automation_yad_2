
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Automation_Yad2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Tony/Desktop/chromedriver_win32/chromedriver.exe");
		//C:\Users\Tony\Desktop\chromedriver_win32
		WebDriver driver = new ChromeDriver();
		while(true){
			driver.get("https://my.yad2.co.il/login.php");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("tonyschneider112@hotmail.com");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234");
			driver.findElement(By.xpath("//*[@id='submitLogonForm']")).click();
//			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[1]")).click();
//			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='feed']/tbody/tr[2]")).click();
			Thread.sleep(3000);
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='feed']/tbody/tr[3]/td/iframe")));
			driver.findElement(By.xpath("//*[@id='bounceRatingOrderBtn']")).click();
			Thread.sleep(14400000);
		}
	}

}
