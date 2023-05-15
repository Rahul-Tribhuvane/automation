package seleniumWebDriver;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class com_opendr_urg {

	public static void main(String[] args) {
		/*
		 * it is important to set the system property for the browser driver before
		 * creating a WebDriver instance. If the system property is not set, then the
		 * WebDriver instance may not be able to find the browser driver executable and
		 * the automation script will fail.
		 */
		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rtrib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Navigate to a website
		driver.get("https://urg.opendr.com/");

		// Find an element on the page by using By() class locators
		// By.id(String id): Locates the web element by its unique ID.
		// By.name(String name): Locates the web element by its name attribute.
		// By.className(String className): Locates the web element by its class name.
		// By.linkText(String linkText): Locates the web element by the exact text of a hyperlink.
		// By.partialLinkText(String partialLinkText): Locates the web element by the partial text of a hyperlink.
		// By.tagName(String tagName): Locates the web element by its HTML tag name.
		// By.cssSelector(String cssSelector): Locates the web element by a CSS selector.
		// By.xpath(String xpath): Locates the web element by an XPath expression.

		// Interact browser with WebDriver methods and element with help of WebElement methods
		List<WebElement> linksBy_tagName = driver.findElements(By.tagName("a"));
		// Iterate over the links and print their text and href attribute
		for (int i = 0; i < linksBy_tagName.size(); i++) {
			if(i<=2) {
		    WebElement link = linksBy_tagName.get(i);
		    System.out.println(link.getText() + " " + link.getAttribute("href"));
			}
			}

		 // Navigate back to the previous page
			        driver.navigate().back();
	     // Refresh the current page
			        driver.navigate().refresh();
	     // Navigate forward to the next page
			        driver.navigate().forward();
			        
		WebElement loginLinkBy_id = driver.findElement(By.id("loginBtn"));
		// Click the element
		loginLinkBy_id.click();                              		
		
		// Get the current URL of the page
				String currentUrl = driver.getCurrentUrl();
				System.out.println("currentUrl: " + currentUrl);
				
	    // Get the title of the page
				String title = driver.getTitle();
				System.out.println("page title: " + title);
					        
		WebElement header=  driver.findElement(By.xpath("(//div[@id=\"enrollModel\"]//h3)[1]"));
		// Get the text of the element
	    String text = header.getText();
		System.out.println("popup header text: " + text);
		
		WebElement forgotPasswordLinkBy_class = driver.findElement(By.className("togglelink1"));
		// Get the value of the element's "class" attribute
	    String classAttr = forgotPasswordLinkBy_class.getAttribute("class");
		System.out.println("classAttr header: " + classAttr);
		// Check if the element is enabled
	    boolean isEnabled = forgotPasswordLinkBy_class.isEnabled();
		System.out.println("isEnabled header status: " + isEnabled);
		 // Check if the element is selected
	    boolean isSelected = forgotPasswordLinkBy_class.isSelected();
		System.out.println("isSelected header status: " + isSelected);
	    // Check if the element is displayed
	    boolean isDisplayed = forgotPasswordLinkBy_class.isDisplayed();
		System.out.println("isDisplayed header status: " + isDisplayed);
		
		WebElement userNameBy_name = driver.findElement(By.name("username"));
		WebElement passwordBy_css = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
		
	    // Enter text into an input field
		userNameBy_name.sendKeys("testautomation@mailinator.com");
		// Clear the contents of an input field
		userNameBy_name.clear();
		userNameBy_name.sendKeys("evan123@mailinator.com");
		passwordBy_css.sendKeys("opendr123");
		
		WebElement loginButtonBy_xpath = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	    // Submit a form by clicking a button
           loginButtonBy_xpath.click();

        // Close the browser window
           driver.quit();
		//WebElement signUpLinkBy_linkText = driver.findElement(By.linkText("Sign Up"));
        

	}

}
