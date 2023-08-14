package test.certificationlogin.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features="src/test/resources/features/login/cart_and_pay.feature",
        glue="test.certificationlogin.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE
)
public class TestAddCart {
}
