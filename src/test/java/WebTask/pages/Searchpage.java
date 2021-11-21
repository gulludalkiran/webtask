package WebTask.pages;

import WebTask.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {

    public Searchpage(){

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".title-wrapper.title")
    public WebElement resultTitle;

    @FindBy(xpath = "h1")
    public WebElement wirelessPageTitle;

    @FindBy(css = "div[class='search-bar']")
    public WebElement searchBrandBox;


    public void verifySearchResult() {

        Assert.assertTrue(resultTitle.getText().contains("Results for"));
    }

    public void verifyWirelessTitle(){
        Assert.assertEquals("Wireless Headphones",wirelessPageTitle.getText());
    }

    public void searchBrandBox(){

    }

    public void searchBrandBoxFor(){
        searchBrandBox.click();
        searchBrandBox.sendKeys("Philips");
        searchBrandBox.sendKeys(Keys.ENTER);

    }
}
