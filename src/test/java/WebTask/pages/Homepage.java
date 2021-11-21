package WebTask.pages;

import WebTask.utils.Driver;
import WebTask.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage(){

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[alt='United States']")
    public WebElement country;

    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement closeButton;

    @FindBy(id = "gh-search-input")
    public WebElement searchBox;

    @FindBy(css = "[aria-label='submit search']")
    public WebElement searchIcon;

    @FindBy(css = ".plButton-label.v-ellipsis")
    public WebElement myAccount;

    @FindBy(css = "button[aria-label='Menu']")
    public WebElement hambugerMenu;

    @FindBy(css = "button[data-id='node-601']")
    public WebElement audioTitle;

    @FindBy(css = "button[data-lid=ubr_au_hed]")
    public WebElement headphonesTitle;

    @FindBy(css = "a[data-lid='ubr_au_hed_wless']")
    public WebElement wirelessTitle;











    public void chooseUS(){
        country.click();
    }

    public void closePopup(){
        closeButton.click();
    }

    public void correctTitle(){
        Assert.assertEquals("Best Buy | Official Online Store | Shop Now & Save", Driver.get().getTitle());

    }

    public void searchFor(String searchKey) {
        searchBox.click();
        searchBox.sendKeys(searchKey);
        searchIcon.click();
    }

    public void openDropdown(String dropdown) {
        String locator = "//span[text()='" + dropdown + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void openSubmenu(String submenu) {
        Helper.clinkWithLinkText(submenu);
    }

    public void verifyAccount(){
        Assert.assertTrue(myAccount.getText().contains("Hi"));
    }

    public void openHamburger(){
        hambugerMenu.click();
    }

    public void selectAudio(){
        audioTitle.click();
    }
    public void selectHeadphones(){
        headphonesTitle.click();
    }
    public void selectWireless(){
        wirelessTitle.click();
    }







}
