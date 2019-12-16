package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

import static configuration.DriverFactory.getDriver;

public class ElementHelper {

    public static WebElement waitForElementToLoad(WebElement element, int seconds){

        FluentWait wait = new FluentWait(getDriver())
                .withTimeout(seconds, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        return element;
    }

    public static void waitForPageToLoad(By locator, String text, int seconds){

        FluentWait wait = new FluentWait(getDriver())
                .withTimeout(seconds, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));

    }
}
