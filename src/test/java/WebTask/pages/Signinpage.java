package WebTask.pages;

import WebTask.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {

    public Signinpage(){

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(tagName = "h1")
    public WebElement title;

    @FindBy(id = "fld-e")
    public WebElement emailAddresses;

    @FindBy(id = "fld-p1")
    public WebElement passWord;

    @FindBy(css = "button[type='submit']")
    public WebElement enter;

    @FindBy(css = ".c-button.c-button-outline.c-button-lg.c-button-block.c-button-icon.c-button-icon-leading.svg-button.social-button.undefined")
    public WebElement signinWithGoogle;

    @FindBy(css = "body")
    public WebElement newTab;

    @FindBy(css = "div[class='search-bar']")
    public WebElement searchBrandBox;




    public void verifyTitle() {

        Assert.assertEquals("Sign In to Best Buy", title.getText());
    }

    public void fillData(String email, String password){
        emailAddresses.sendKeys(email);
        passWord.sendKeys(password);
    }
    public void login(){
        enter.sendKeys(Keys.ENTER);
    }

    public void loginWithGoogle(){
        signinWithGoogle.click();
    }

    public void openNewTab(){
        newTab.sendKeys(Keys.CONTROL + "t");
    }



}
