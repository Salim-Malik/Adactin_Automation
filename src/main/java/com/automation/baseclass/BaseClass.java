package com.automation.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		return driver;

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void isdisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();

		System.out.println(displayed);

	}

	public static void isenabled(WebElement element) {

		boolean enabled = element.isEnabled();

		System.out.println(enabled);

	}

	public static void isselected(WebElement element) {

		boolean selected = element.isSelected();

		System.out.println(selected);

	}

	public static void navigateTo(String value) {

		driver.navigate().to(value);

	}

	public static void navigate_Back() {

		driver.navigate().back();

	}

	public static void navigate_forward() {

		driver.navigate().forward();

	}

	public static void navigate_Refresh() {

		driver.navigate().refresh();

	}

	public static void sleep() throws Throwable {

		Thread.sleep(3000);

	}
	


	public static void quit() {

		driver.quit();
	}

	public static void close() {

		driver.close();

	}

	public static void get_Options(WebElement element) {

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		System.out.println(options);

	}

	public static void get_title() {

		String value = driver.getTitle();

		System.out.println(value);

	}

	public static void getCutrrentURL() {

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);
	}

	public static void get_Text(WebElement element) {

		String text = element.getText();
		System.out.println(text);

	}

	public static void getattribute(WebElement element, String value) {

		String attribute = element.getAttribute(value);

		System.out.println(attribute);

	}

	public static void isMultiple(WebElement element) {

		Select s = new Select(element);

		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	public static void takeSC(String path) throws Throwable {

		TakesScreenshot snap = (TakesScreenshot) driver;

		File source = snap.getScreenshotAs(OutputType.FILE);

		File destination = new File(path);

		FileUtils.copyFile(source, destination);

	}

	public static void scrollUp_Down(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void drop_Down(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("index")) {

			int parseInt = Integer.parseInt(value);

			s.selectByIndex(parseInt);

		}

		else if (type.equalsIgnoreCase("value")) {

			s.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("visibleText")) {

			s.selectByVisibleText(value);
		}

	}

	public static void wait_Types(WebElement element, String type, int duration, TimeUnit format) {

		if (type.equalsIgnoreCase("Implicit wait")) {

			driver.manage().timeouts().implicitlyWait(duration, format);

		}

		else if (type.equalsIgnoreCase("Explicit wait")) {

			WebDriverWait wait = new WebDriverWait(driver, duration);

			wait.until(ExpectedConditions.visibilityOf(element));

		}

	}

	public static void mouse_Action(WebElement element, String type) {

		Actions a = new Actions(driver);

		if (type.equalsIgnoreCase("click")) {

			a.click().build().perform();

		} else if (type.equalsIgnoreCase("contextClick")) {

			a.contextClick().build().perform();

		}

		else if (type.equalsIgnoreCase("doubleClick")) {

			a.doubleClick().build().perform();

		}

		else if (type.equalsIgnoreCase("moveToElement")) {

			a.moveToElement(element).build().perform();

		}

	}

	public static void robot_KB(WebElement element, String type) throws Throwable {

		Robot r = new Robot();

		if (type.equalsIgnoreCase("down")) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		else if (type.equalsIgnoreCase("double_Down")) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}

	}

	public static void frame(String type, String value) {

		if (type.equalsIgnoreCase("index")) {

			int parseInt = Integer.parseInt(value);
			driver.switchTo().frame(parseInt);
		}

		else if (type.equalsIgnoreCase("id")) {

			driver.switchTo().frame(value);

		}

		else if (type.equalsIgnoreCase("wbelement")) {

			String element = null;
			driver.switchTo().frame(element);

		}

	}

	public static void simpleAlert() {

		driver.switchTo().alert().accept();

	}

	public static void confirmAlert(String ok, String cancel) {

		if (ok.equalsIgnoreCase("accept")) {

			driver.switchTo().alert().accept();

		}

		else if (cancel.equalsIgnoreCase("dismiss")) {

			driver.switchTo().alert().dismiss();

		}
	}

	public static void promptAlert(String ok, String cancel, String text) {

		if (ok.equalsIgnoreCase("okay")) {

			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();

		}

		else if (cancel.equalsIgnoreCase("cancel")) {

			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().dismiss();
			driver.switchTo().defaultContent();

		}

	}

	public static void getAllOptions(WebElement element, String type) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("get options")) {

			List<WebElement> all_Options = s.getOptions();
			System.out.println("All_Options");

			for (WebElement options : all_Options) {

				String text = options.getText();
				System.out.println(text);

			}

		}

		else if (type.equalsIgnoreCase("get All Selected Options")) {

			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

			for (WebElement selected_options : allSelectedOptions) {

				System.out.println(selected_options.getText());

			}
		}

		else if (type.equalsIgnoreCase("get First Selected Option")) {

			WebElement firstSelectedOption = s.getFirstSelectedOption();

			System.out.println(firstSelectedOption.getText());
		}
	}

}
	
	
	

