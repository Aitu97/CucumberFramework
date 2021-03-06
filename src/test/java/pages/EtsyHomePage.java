package pages;

import cucumber.api.java.en_lol.WEN;
import gherkin.lexer.Pa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyHomePage {

    WebDriver driver;

    public  EtsyHomePage(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(id = "catnav-primary-link-10855")
    public WebElement JeweleryA;

    @FindBy(id = "catnav-primary-link-10923")
    public WebElement ClothesS;

    @FindBy(id = "catnav-primary-link-891")
    public WebElement HomeL;

    @FindBy(id = "catnav-primary-link-10983")
    public WebElement WeddingP;

    @FindBy(id = "catnav-primary-link-11049")
    public WebElement ToysE;

}
