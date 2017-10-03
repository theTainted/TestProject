package Cortefiel.testcases;

        import Cortefiel.pageobjects.HomePage;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Parameters;
        import org.testng.annotations.Test;

public class TrialTestClass {

@Parameters("browser")
@BeforeClass
public void getBrowser(String browser){

}










    @Test
    public void testTrialTestClass(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        String sURL = "https://"+"storefront"+":"+"storefront"+"@"+"development.cortefiel.com/es/es";
        driver.get(sURL);
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnCloseButtonInNewsLetter();
        homePage.clickOnCloseOnCloseInCookies();

    }
}
