package Cortefiel.testcases;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class TrialTestClass {
    public static void main (String[] args){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        String sURL = "https://"+"storefront"+":"+"storefront"+"@"+"development.cortefiel.com/es/es";
        driver.get(sURL);
        driver.manage().window().maximize();


    }
}
