package test.certificationlogin.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderPayment {
    public static final net.serenitybdd.screenplay.targets.Target TXT_USER_PAY = Target.the("Input username in the pay").located(By.xpath("//div[@class='noUserSection']/sec-form/sec-view/div/input[@name='usernameInOrderPayment']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PASSWORD_PAY = Target.the("Input password in the pay").located(By.xpath("//div[@class='noUserSection']/sec-form/sec-view[2]/div/input[@name='passwordInOrderPayment']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_LOGIN_PAY = Target.the("Button to login in the pay").located(By.xpath("//div[@class='noUserSection']/sec-form/sec-sender/button[@id='login_btn']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_NEXT_PAY = Target.the("Button to next").located(By.xpath("//div[@id='userSection']/div/div[3]/button[@id='next_btn']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_METHOD_PAY = Target.the("Button to selectmethod of pay").located(By.xpath("//div[@id='paymentMethod']/div/div[@class='paymentMethods']/div[2]/input[@name='masterCredit']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_CARD_NUMBER = Target.the("Input to card number").located(By.xpath("//div[@class='spliter']/sec-view/div[@class='inputContainer ng-scope']/input[@name='card_number']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_CVV = Target.the("Input to cvv").located(By.xpath("//div[@class='spliter']/sec-view/div[@class='inputContainer ng-scope']/input[@name='cvv_number']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_MM = Target.the("Button to select months of card").located(By.xpath("//div[@class='payment_date']/sec-view/div[@class='inputContainer ng-scope']/select/option[@value='string:06']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_YYYY = Target.the("Button to select year of card").located(By.xpath("//div[@class='payment_date']/sec-view[2]/div[@class='inputContainer ng-scope']/select[@name='yyyyListbox']/option[@value='string:2029']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_CARD_HOLDER = Target.the("Input to card holder").located(By.xpath("//div[@class='spliter']/sec-view/div[@class='inputContainer ng-scope']/input[@name='cardholder_name']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_PAY_NOW = Target.the("Button to pay").located(By.xpath("//div[@class='blueLink']/label/sec-sender/button[@id='pay_now_btn_ManualPayment']"));
}
