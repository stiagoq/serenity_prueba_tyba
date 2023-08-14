package test.certificationlogin.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.certificationlogin.questions.ResutlAddAndPay;
import test.certificationlogin.utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static test.certificationlogin.task.SingUpOrderPayment.SingUpOrderPayment;
import static test.certificationlogin.utils.ConstantManage.ConstantManage.ACTOR;
import static test.certificationlogin.utils.ConstantManage.ConstantManage.URL;
import static test.certificationlogin.task.ClickPopularItems.ClickPopularItems;
import static test.certificationlogin.task.AddTable.AddTable;
import static test.certificationlogin.task.AddPc.AddPc;
import static test.certificationlogin.task.AddSpeaker.AddSpeaker;
import static test.certificationlogin.utils.others.BackPage.inBrowser;
import static test.certificationlogin.task.ClickShoppingCart.ClickShoppingCart;
import static test.certificationlogin.task.PayNow.PayNow;

public class TestAddCartStepDefinition {
    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user is in tab popular items")
    public void theUserIsInTabPopularItems() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
        theActorInTheSpotlight().wasAbleTo(ClickPopularItems());
    }

    @When("the user select and add of the products")
    public void theUserSelectAndAddOfTheProducts() {
        theActorInTheSpotlight().wasAbleTo(AddTable());
        theActorInTheSpotlight().wasAbleTo(inBrowser());
        theActorInTheSpotlight().wasAbleTo(AddPc());
        theActorInTheSpotlight().wasAbleTo(inBrowser());
        theActorInTheSpotlight().wasAbleTo(AddSpeaker());
        theActorInTheSpotlight().wasAbleTo(inBrowser());
        theActorInTheSpotlight().wasAbleTo(ClickShoppingCart());

    }
    @When("the user enter of data in the form")
    public void theUserEnterOfDataInTheForm(){
        theActorInTheSpotlight().wasAbleTo(ClickShoppingCart());
        theActorInTheSpotlight().wasAbleTo(SingUpOrderPayment());
        theActorInTheSpotlight().wasAbleTo(PayNow());


    }

    @Then("The user sees message of successful purchase")
    public void theUserSeesMessageOfSuccessfulPurchase() {
        theActorInTheSpotlight().should(
                seeThat(
                       ResutlAddAndPay.resutlpay(), equalTo(true))
        );
    }
}
