package xpathAutomatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPathCalculator {
    
    public static String calculateXPath(WebDriver driver, WebElement element) {
        return calculateXPath(driver, element, "");
    }

    private static String calculateXPath(WebDriver driver, WebElement element, String currentPath) {
        String tagName = element.getTagName();
        String id = element.getAttribute("id");
        String className = element.getAttribute("class");
        String text = element.getText();

        if (id != null && !id.isEmpty()) {
            return currentPath + "//" + tagName + "[@id='" + id + "']";
        }

        if (className != null && !className.isEmpty()) {
            return currentPath + "//" + tagName + "[contains(@class, '" + className + "')]";
        }

        if (text != null && !text.isEmpty()) {
            return currentPath + "//" + tagName + "[contains(text(), '" + text + "')]";
        }

        int index = findElementIndex(driver, element);
        String newPath = currentPath + "//" + tagName + "[" + index + "]";

        if (driver.findElements(By.xpath(newPath)).size() == 1) {
            return newPath;
        }

        return calculateXPath(driver, element, newPath);
    }

    private static int findElementIndex(WebDriver driver, WebElement element) {
        String tagName = element.getTagName();
        int index = 1;

        for (WebElement sibling : element.findElements(By.xpath("preceding-sibling::" + tagName))) {
            if (sibling.isDisplayed()) {
                index++;
            }
        }

        return index;
    }
}

