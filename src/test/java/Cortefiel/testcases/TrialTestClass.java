package Cortefiel.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialTestClass {
    public static void main (String[] args){
        WebDriver driver;
        driver = new ChromeDriver();
        String sURL = "https://"+"storefront"+":"+"storefront"+"@"+"development.cortefiel.com/es/es";
        driver.get(sURL);

    }
}
