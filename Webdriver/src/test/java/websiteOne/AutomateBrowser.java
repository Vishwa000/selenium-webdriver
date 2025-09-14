package websiteOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\git\\Webdriver\\Webdriver\\target\\chromedriver.exe"); // launch Chrome browser

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ASUS\\git\\Webdriver\\Webdriver\\target\\msedgedriver.exe"); // launch Edge browser

		try {

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.amazon.in/"); // Pass the URL using get();
			driver.manage().window().maximize();

			String currentUrl = driver.getCurrentUrl();
			System.out.println("Page URL: " + currentUrl); // console the currentUrl link

			driver.switchTo().newWindow(WindowType.TAB); // Open new tab

			String facebookUrl = "https://www.facebook.com/";
			driver.navigate().to(facebookUrl); // // Pass the URL using navigate().to();
			driver.navigate().refresh(); // refresh the page
			driver.navigate().back(); // Go back to previous page
			driver.navigate().forward(); // Go forward to Facebook again
			driver.manage().window().minimize();
//		    driver.close(); // close the current tab

			// launch the Edge browser
			WebDriver driver2 = new EdgeDriver();

			driver2.get("https://www.udemy.com/"); // Pass the udemy URL using get();
			driver2.manage().window().maximize(); // maximize the page

			String pageTitle = driver2.getTitle();
			System.out.println("Page Title: " + pageTitle + "\n"); // console the page title

			driver2.switchTo().newWindow(WindowType.TAB); // Open new tab

			String chatGptUrl = "https://chatgpt.com/";
			driver2.navigate().to(chatGptUrl); // // Pass the URL using navigate().to();
			driver2.navigate().refresh(); // refresh the page
			driver2.navigate().back(); // Go back to previous page
			driver2.navigate().forward(); // Go forward to chatgpt again
			driver2.quit(); // close all the edge tabs

			driver.quit(); // close all the chrome tabs

//			if (driver.getTitle() != null) {
//				System.out.println("Chrome browser is Running"); // Its throws the exception NoSuchSessionException so we can go for try catch
//
//			} else {
//				System.out.println("Chrome browser closed Succesfully");
//
//			}

			try {
				driver.getTitle();

			} catch (Exception e) {
				System.out.println("Chrome browser closed Succesfully");
			}

			try {
				driver2.getTitle();

			} catch (Exception e) {
				System.out.println("Edge browser closed Succesfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
