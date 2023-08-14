package test.certificationlogin.userInterfaces;

import  net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class CreateAccountPage {

    public static final net.serenitybdd.screenplay.targets.Target TXT_USERNAME = Target.the("TXT_USERNAME").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='usernameRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PASSWORD = Target.the("TXT_PASSWORD").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='passwordRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_EMAIL = Target.the("TXT_EMAIL").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='emailRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_COMFIRPASSWORD = Target.the("TXT_CONFIRM_PASSWORD").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='confirm_passwordRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_NAME = Target.the("TXT_FISRT_NAME").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='first_nameRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_LASTAME = Target.the("TXT_LAST_NAME").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='last_nameRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PHONE = Target.the("TXT_PHONE").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='phone_numberRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_COUNTRY = Target.the("BTN_COUNTRY").located(By.xpath("//div[@class='inputContainer ng-scope']/select[@name='countryListboxRegisterPage']/option[@label='Colombia' or @value='object:116']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_CITY = Target.the("TXT_CITY").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='cityRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_ADDRESS = Target.the("TXT_ADDRESS").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='addressRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_STATE = Target.the("TXT_STATE").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='state_/_province_/_regionRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_POSTAL = Target.the("TXT_POSTAL_CODE").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@name='postal_codeRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_CHECK = Target.the("BTN_CHECKBOXL_I_AGREE").located(By.xpath("//div[@class='inputContainer ng-scope']/input[@type='checkbox' and @name='i_agree']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_REGISTER = Target.the("BTN_REGISTER").located(By.xpath("//div[@class='center']/sec-sender[@class='roboto-medium ng-isolate-scope sec-sender']/button[@id='register_btn']"));

}
