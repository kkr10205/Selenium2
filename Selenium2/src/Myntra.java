import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();
	// driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String url="https://www.myntra.com";
	driver.get(url);
	WebElement men=driver.findElement(By.xpath("//a[text()='Men'][@data-group='men']"));
	
	WebElement bag=driver.findElement(By.xpath("//a[text()='Bags & Backpacks'][@href='/men-bags-backpacks']"));
	Actions a=new Actions(driver);
	a.moveToElement(men).build().perform();
	Thread.sleep(5000);
	a.moveToElement(bag).click().build().perform();
	Thread.sleep(5000);
	WebElement first=driver.findElement(By.xpath("(//li[@class='product-base'])[1]"));
	a.moveToElement(first).build().perform();
	Thread.sleep(5000);
	WebElement add=driver.findElement(By.xpath("(//span[text()='Add to bag'])[1]"));
	a.moveToElement(add).click().build().perform();
	Thread.sleep(6000);
	WebElement size=driver.findElement(By.xpath("(//button[@class='product-sizeButton'])[1]"));
	a.moveToElement(size).click().build().perform();
	Thread.sleep(5000);
	WebElement cart=driver.findElement(By.xpath("//span[text()='Bag']"));
	a.moveToElement(cart).click().build().perform();
	Thread.sleep(5000);
	WebElement remove=driver.findElement(By.xpath("//button[text()='Remove']"));
	a.moveToElement(remove).click().build().perform();
	Thread.sleep(3000);
	 driver.switchTo().frame(1);
	WebElement remove1=driver.findElement(By.xpath("(//button[text()='Move to WishList'])[2]"));
	remove1.click();
	
	
	
	
	
	
	}

}
