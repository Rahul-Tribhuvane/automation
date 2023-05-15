package seleniumWebDriver;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class opendr_urg {

	public static void main(String[] args) throws InterruptedException {

		// Set the system property for the browser driver
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
			
		// Create a new instance of the Chrome driver and maximize the window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to a website
		driver.get("https://urg.opendr.com/");

		// Find links on the page by using the By() class locators
		List<WebElement> linksBy_tagName = driver.findElements(By.tagName("a"));

		// Iterate over the links and print their text and href attribute
		for (int i = 0; i < linksBy_tagName.size(); i++) {
			if(i<=2) {
				WebElement link = linksBy_tagName.get(i);
				System.out.println(link.getText() + " " + link.getAttribute("href"));
			}
		}

		// Navigate back to the previous page, refresh the page, and navigate forward
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().refresh();
//		driver.navigate().forward();

		Thread.sleep(1000);
		// Find the login link element by ID and click it
		WebElement loginLinkBy_id = driver.findElement(By.id("loginBtn"));
		loginLinkBy_id.click();
		
		Thread.sleep(1000);
		// Get the current URL and page title of the website
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl: " + currentUrl);
		String title = driver.getTitle();
		System.out.println("page title: " + title);

		// Find an element by XPath and get its text
		WebElement header = driver.findElement(By.xpath("(//div[@id=\"enrollModel\"]//h3)[1]"));
		String text = header.getText();
		System.out.println("popup header text: " + text);

		// Find an element by class name and get its attributes and status
		WebElement forgotPasswordLinkBy_class = driver.findElement(By.className("togglelink1"));
		String classAttr = forgotPasswordLinkBy_class.getAttribute("class");
		System.out.println("classAttr header: " + classAttr);
		boolean isEnabled = forgotPasswordLinkBy_class.isEnabled();
		System.out.println("isEnabled header status: " + isEnabled);
		boolean isSelected = forgotPasswordLinkBy_class.isSelected();
		System.out.println("isSelected header status: " + isSelected);
		boolean isDisplayed = forgotPasswordLinkBy_class.isDisplayed();
		System.out.println("isDisplayed header status: " + isDisplayed);

		// Find elements by name and CSS selector and enter text into input fields
		WebElement userNameBy_name = driver.findElement(By.name("username"));
		WebElement passwordBy_css = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
		userNameBy_name.sendKeys("testautomation@mailinator.com");
		Thread.sleep(500);
		userNameBy_name.clear();
		Thread.sleep(500);
		userNameBy_name.sendKeys("evan123@mailinator.com");
		Thread.sleep(500);
		passwordBy_css.sendKeys("opendr123");
		
		Thread.sleep(1000);
		// Find an element by XPath and submit the form by clicking it
		WebElement loginButtonBy_xpath = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		loginButtonBy_xpath.click();

		Thread.sleep(4000);
		// Close the browser window
		driver.quit();

	}
}
