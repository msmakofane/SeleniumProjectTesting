package Tests;

import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserFactory;

import Utils.TakeScreenshoots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Base {

    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected TakeScreenshoots takeScreenshoots;
//
//
//    BrowserFactory browserFactory = new BrowserFactory();
//
//    final WebDriver driver = browserFactory.startBrowser("Chrome","https://ndosisimplifiedautomation.vercel.app/" headless);
//
//    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
//    DashboardPage dashboardPage = PageFactory.initElements(driver,DashboardPage.class);
//    TakeScreenshoots takeScreenshoots = new TakeScreenshoots();
//
//}

    @BeforeClass
    public void setUp() {

            boolean headless = Boolean.parseBoolean(System.getProperty("headless", "true"));

            driver = BrowserFactory.startBrowser("Chrome", "https://ndosisimplifiedautomation.vercel.app/", headless);

            homePage = new HomePage(driver);
            loginPage = new LoginPage(driver);
            dashboardPage = new DashboardPage(driver);

            PageFactory.initElements(driver, homePage);
            PageFactory.initElements(driver, loginPage);
            PageFactory.initElements(driver, dashboardPage);

            takeScreenshoots = new TakeScreenshoots();

        }

        @AfterTest
        public void tearDown () {
            if (driver != null) {
                driver.quit();
            }
        }


    }