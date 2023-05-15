package Webdriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rtrib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://urg.opendr.com");  //launch url;

driver.findElement(By.xpath("//a[@id=\"loginBtn\"]")).click();
String title=driver.getTitle();
System.out.println("title: "+title);
driver.navigate().to("https://www.facebook.com/");   //get(), session create 

System.out.println("navigate to facbook page");
driver.navigate().back(); //navigate back to main page
System.out.println("navigate to back to urg page");
driver.navigate().forward();
System.out.println("navigate to facbook page");
driver.navigate().refresh();
System.out.println("facbook page get refresh");


//
////method chaning
//driver.findElement(By.xpath("(//input[@placeholder=\"Enter your e-mail address\"])[1]")).sendKeys("evan123@mailinator.com");
//Thread.sleep(2000);
////opps concept
//WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]"));
//password.sendKeys("opendr123");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//button[text()='Login']")).click();
//Thread.sleep(5000);
////driver.close();


	}

}