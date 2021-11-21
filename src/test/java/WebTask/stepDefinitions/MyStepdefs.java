package WebTask.stepDefinitions;

import WebTask.pages.Homepage;
import WebTask.pages.Searchpage;
import WebTask.pages.Signinpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    Homepage homepage = new Homepage();
    Searchpage searchpage = new Searchpage();
    Signinpage signinpage = new Signinpage();

    @Given("homepage is open")
    public void homepageIsOpen() {
        homepage.chooseUS();
    }

    @And("I close the pop up")
    public void iCloseThePopUp() {
        homepage.closePopup();
    }

    @Then("title should be correct")
    public void titleShouldBeCorrect() {
        homepage.correctTitle();
    }

    @And("search for {string}")
    public void searchFor(String searchKey) {
        homepage.searchFor(searchKey);
    }

    @Then("search result should be seen")
    public void searchResultShouldBeSeen() {
        searchpage.verifySearchResult();
    }

    @And("I open {string} dropdown menu")
    public void iOpenDropdownMenu(String dropdown) {
        homepage.openDropdown(dropdown);
    }

    @When("I choose {string}")
    public void iChoose(String submenu) { homepage.openSubmenu(submenu);
    }

    @And("I login with {string} and {string}")
    public void iLoginWithAnd(String email, String password) {
        signinpage.fillData(email, password);
    }

    @Then("sign in page should be opened")
    public void signInPageShouldBeOpened() {
        signinpage.verifyTitle();
    }

    @Then("I entered")
    public void iEntered() {
        signinpage.login();
    }

    @Then("I see my account")
    public void iSeeMyAccount() {
        homepage.verifyAccount();
    }

    @And("sign in with Google")
    public void signInWithGoogle() {
        signinpage.loginWithGoogle();
    }

    @And("verify the login")
    public void verifyTheLogin() {
    }

    @And("open new tab")
    public void openNewTab() {
        signinpage.openNewTab();
    }

    @And("I open hamburger menu")
    public void iOpenHamburgerMenu() {
        homepage.openHamburger();
    }

    @And("I select Audio")
    public void iSelectAudio() {
        homepage.selectAudio();
    }

    @And("I select Headphones")
    public void iSelectHeadphones() {
        homepage.selectHeadphones();
    }

    @And("I select Wireless Headphones")
    public void iSelectWirelessHeadphones() {
        homepage.selectWireless();
    }

    @And("verify the wireless headphones title")
    public void verifyTheWirelessHeadphonesTitle() {
        searchpage.verifyWirelessTitle();

    }

    @And("scroll down")
    public void scrollDown() {
    }

    @And("search brand for {string}")
    public void searchBrandFor(String searchBrand) {
        searchpage.searchBrandBoxFor();
    }



}
