package test.certificationlogin.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.certificationlogin.questions.ResultLogin;
import test.certificationlogin.task.LoginUser;
import test.certificationlogin.userInterfaces.HomePageUnitTest;
import test.certificationlogin.utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static test.certificationlogin.task.LoginUser.LoginUser;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static test.certificationlogin.utils.ConstantManage.ConstantManage.ACTOR;
import static test.certificationlogin.utils.ConstantManage.ConstantManage.URL;
public class TestLoginStepDefinition {


    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user on the home page")
    public void theUserOnTheHomePage() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
    }

    @When("the user type the {string} and {string}")
    public void theUserTypeTheAnd(String username, String password)  {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().wasAbleTo(LoginUser.LoginUser(username, password));
        theActorInTheSpotlight().wasAbleTo();
    }

    @Then("the app shows the init page")
    public void theAppShowsTheInitPage() {
        theActorInTheSpotlight().should(
                seeThat(ResultLogin.result(), equalTo(true))
        );
    }
}
