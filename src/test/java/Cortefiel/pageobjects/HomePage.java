package Cortefiel.pageobjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ui-dialog-titlebar-close']")
    WebElement btnClickCloseOnNewsLetter;


    public HomePage(WebDriver driver) {
        General.driver = driver;
        //  this.general.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickOnCloseButtonInNewsLetter() {
        try {
            btnClickCloseOnNewsLetter.click();
        } catch (NoSuchElementException e) {
            e.getStackTrace();
        }
    }
}