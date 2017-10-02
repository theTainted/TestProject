package Cortefiel.pageobjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ui-dialog-titlebar-close']")
    WebElement btnClickCloseOnNewsLetter;
    @FindBy(xpath="//a[@class='btn-cancel c09__close c09__close--cookie']")
    WebElement btnClickOnCloseInCookies;

    public HomePage(WebDriver driver) {
        General.driver = driver;
        //  this.general.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCloseButtonInNewsLetter() {
        try {
            btnClickCloseOnNewsLetter.click();
        } catch (NoSuchElementException e) {
            e.getStackTrace();
        }
    }
    public void clickOnCloseOnCloseInCookies() {
        try {
            btnClickOnCloseInCookies.click();
        } catch (NoSuchElementException e) {
            e.getStackTrace();
        }
    }
}