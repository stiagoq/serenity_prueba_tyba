package test.certificationlogin.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.certificationlogin.questions.ResultRegister;
import test.certificationlogin.task.ClickAccount;
import test.certificationlogin.task.RegisterUser;
import test.certificationlogin.userInterfaces.MyAccount;
import test.certificationlogin.utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static test.certificationlogin.utils.ConstantManage.ConstantManage.ACTOR;
import static test.certificationlogin.utils.ConstantManage.ConstantManage.URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static test.certificationlogin.task.RegisterUser.ResgisterUser;
import static test.certificationlogin.task.ClickAccount.ClickAccount;


public class TestRegisterStepDefinitions {

    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("User is in the registration page")
    public void userIsInTheRegistrationPage() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));

    }

    @When("User enters the data required in the form")
    public void userEntersTheDataRequiredInTheForm() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().wasAbleTo(ResgisterUser());
        theActorInTheSpotlight().wasAbleTo(ClickAccount());


    }

    @Then("it shows me a successful registration")
    public void theUserCanSeeTheInitPage() {
        theActorInTheSpotlight().should(
                seeThat(ResultRegister.resultRegister(), equalTo(true)));
    }

}
