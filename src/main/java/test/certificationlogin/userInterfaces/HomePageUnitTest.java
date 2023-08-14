package test.certificationlogin.userInterfaces;

import net.serenitybdd.core.pages.ResolvableElement;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class HomePageUnitTest {

    public static final net.serenitybdd.screenplay.targets.Target BTN_CREATE =Target.the("Button to sing up or login").located(By.xpath("//*[contains(@id,'menuUserLink')]"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_CREATENEW = Target.the("Button to create new account").located(By.xpath("//div[@class='login ng-scope']/a[@class='create-new-account ng-scope']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_USER = Target.the("Input username").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='username']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PASS = Target.the("Input password").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='password']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_REMEMBER = Target.the("Check box for remember").located(By.xpath("//div[@class='left option ']/input[@type='checkbox' and @name='remember_me']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_SING = Target.the("Button to sing up").located(By.xpath("//div[@class='login ng-scope']/sec-form/sec-sender[@class='roboto-medium ng-isolate-scope sec-sender']/button[@id='sign_in_btn']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_FAIL = Target.the("Message for incorrect login").located(By.xpath("//label[@id='/html/body/login-modal/div/div/div[3]/label' or @class='or  center']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_LOGIN_EXITOSO = Target.the("Text to successful login").located(By.xpath("//a[@id='menuUserLink']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_POPULAR_ITEMS = Target.the("Button of popular items").located(By.xpath("//nav/ul/li[@class='nav-li-Links'][2]/a[@translate='POPULAR_ITEMS']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_ACCOUNT = Target.the("Button to go my account").located(By.xpath("//*[contains(@id,'menuUserLink')]/div/label[@class='option roboto-medium ng-scope']"));


}
