package nl.codecontrol.cucumber.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    private static final String GOOGLE_URL = "https://www.google.com";
    @FindBy(css = "#hplogo")
    private WebElement logo;

    @FindBy(css = "input[name=q]")
    private WebElement searchInput;

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void openGoogleSearch() {
        driver.get(GOOGLE_URL);
        wait.forElementToBeDisplayed(5, this.logo, "Logo");
    }

    public void searchFor(String searchValue) {
        this.searchInput.sendKeys(searchValue);
        this.searchInput.sendKeys(Keys.ENTER);
    }
}
