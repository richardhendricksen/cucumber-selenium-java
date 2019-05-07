package nl.codecontrol.cucumber.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage extends BasePage {

    @FindBy(css = "#ires h3")
    private List<WebElement> results;

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String getResult(int number) {
        return results.get(number - 1).getText();
    }
}
