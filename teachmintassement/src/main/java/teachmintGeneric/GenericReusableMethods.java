package teachmintGeneric;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class GenericReusableMethods implements Teachmintconstants {
	public Actions action;
	public SoftAssert softAssert;
	public WebDriverWait wait;
	public static WebDriver driver;

	public String getPropertyValue(String key) throws IOException {
		File file = new File(PROPERTIES_PATH);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	public void initObjects(WebDriver driver) {
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(Explicit_timeout));
		softAssert = new SoftAssert();
	}

	public void scrollActionTillWebElement(WebElement element) {
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(("window.scrollTo(" + xaxis + "," + yaxis + ")"));
	}

	public WebDriverWait useExplicitWait(WebDriver driver, int sec) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait;
	}
}
