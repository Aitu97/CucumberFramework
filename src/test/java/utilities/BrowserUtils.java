package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

        // driver, element

        /*
        this method will get hover over the WebElement
        you need to pass element and driver
         */
        public static void hover(WebElement element, WebDriver driver) {

            Actions actions = new Actions(driver);

            actions.moveToElement(element).build().perform();


        }

        //drag and drop


        /*
        this method will take the text of the WebElement and return the string
        you need to pass the element
         */
        public static String getText(WebElement element){
            return  element.getText();
        }
    /*
    this method will take the list of WebElement
    it will return list of text from the WebElement
     */

        public static List<String> getElementText(List<WebElement>elements){
            List<String> textList = new ArrayList<>();

            for (WebElement el: elements){
                if (el.getText().isEmpty()){
                    textList.add( el.getText()) ;
                }
            }
            return textList;
        }

        public static void visibilityOfElement(WebDriver driver,  WebElement element, int time){

            WebDriverWait wait = new  WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOf(element));

        }
        //clickable, isAlertPresent --> homework

        public static void switchWindow(String targetTitle, WebDriver driver){
            String origin = driver.getWindowHandle();
            Set<String> allWindows= driver.getWindowHandles();

            for (String windows: allWindows){
                driver.switchTo().window(windows);

                if (driver.getTitle().equals(targetTitle)){

                    return;
                }
            }
            driver.switchTo().window(origin);

        }
    }


