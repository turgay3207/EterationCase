package utilities;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Driver {
    private Driver() {}

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public static WebDriver getDriver() {
        return getDriver(ConfigReader.getProperty("browser"));
    }


    public static WebDriver getDriver(String browser) {
        if (driver.get() == null) {
            if (browser == null) {
                browser = ConfigReader.getProperty("browser"); //
            }

            switch (browser.toLowerCase()) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    options.addArguments("--disable-notifications");


                    driver.set(new ChromeDriver(options));
                    break;
                case "firefox":
                    FirefoxOptions options1 = new FirefoxOptions();
                    options1.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    options1.addArguments("--disable-notifications");
                    driver.set(new FirefoxDriver(options1));
                    break;
                case "edge":
                    driver.set(new EdgeDriver());
                    break;

            }

            driver.get().manage().window().maximize();
            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        }
        return driver.get();
    }

    public static void closeDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
