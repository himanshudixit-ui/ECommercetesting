package com.amdocs.myamazon.actiondriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.myamazon.baseclass.BaseClass;

public class Action extends BaseClass{
	
	public static void pageWaiting(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void windowMaximize(WebDriver driver)
    {
        driver.manage().window().maximize();
    }

    public static void explicitWait(WebDriver driver, WebElement element, int timeOut ) {
        WebDriverWait wait = new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void click(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
        System.out.println("clicked on" + element);
    }

 

    
    public static boolean findElement(WebDriver driver, WebElement element) {
        boolean flag = false;
        try {
            element.isDisplayed();
            flag = true;
        }catch(Exception e){
            flag = false;
        }finally
        {
            if(flag) {
                System.out.println("Element found");
            }else {
                System.out.println("Element not found");
            }
        }
        return flag;
    }

 

    public static boolean isDisplayed(WebDriver driver, WebElement element) {
        boolean flag = false;
        flag = findElement(driver,element);
        if(flag) {
            flag = element.isDisplayed();
            if(flag) {
                System.out.println("Element is displayed");
            }else {
                System.out.println("Element is not displayed");
            }
        }
        else {
            System.out.println("Not Displayed");
        }
        return false;
    }

 

    public static boolean type(WebElement element, String text) {
        System.out.println("Inside Action class type method");
        boolean flag = false;
        try {
//            flag = element.isDisplayed();
//            element.clear();
            element.sendKeys(text);
            flag = true;
        }catch(Exception e)
        {
            System.out.println("Location  not found");
        }finally
        {
            if(flag) {
                System.out.println("Successfully entered the text");
            }else {
                System.out.println("Unable to enetered the text");
            }
        }
        return false;
    }

    public static boolean click1(WebElement locator, String locatorName) {
        boolean flag = false;
        try {
            locator.click();
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Able to click on \""+locatorName+"\"");
            } else {
                System.out.println("Click Unable to click on \""+locatorName+"\"");
            }
        }

 

    }

    public static boolean switchToNewWindow(WebDriver driver) {
        boolean flag = false;
        try {
            Set<String> s=driver.getWindowHandles();
            Object popup[]=s.toArray();
            driver.switchTo().window(popup[1].toString());
            flag = true;
            return flag;
        } catch (Exception e) {
            flag = false;
            return flag;
        } finally {
            if (flag) {
                System.out.println("Window is Navigated with title");                
            } else {
                System.out.println("The Window with title: is not Selected");
            }
        }
    }

}
