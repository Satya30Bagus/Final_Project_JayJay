package stepDef;

import com.satya.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.login_page;


public class login_stepDef extends BaseTest {

    login_page loginpage;

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        loginpage = new login_page(driver);
        loginpage.goToLoginpage();
    }

    @When("User click login button in navigation")
    public void userClickLoginButtonInNavigation() {
        loginpage.clickloginButtononNavigation();
    }

    @And("User input username with {string}")
    public void userInputUsernameWith(String username) {
        loginpage.inputUsername(username);
    }

    @And("User input password with {string}")
    public void userInputPasswordWith(String password) {
        loginpage.inputPassword(password);
    }

    @And("User click login button")
    public void userClickLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("User is on homepage")
    public void userIsOnHomepage() {
    }

    @And("User stay on landing page")
    public void userStayOnLandingPage() {
    }

    @Then("User able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {loginpage.validateErrorAppear(errorMessage);
    }

    @Then("User able to see message on navigation {string}")
    public void userAbleToSeeMessageOnNavigation(String Welcomemessage) {loginpage.validateWelcomeMessage(Welcomemessage);
    }
}
