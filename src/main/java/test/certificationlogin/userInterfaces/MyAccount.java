package test.certificationlogin.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccount {
    public static final net.serenitybdd.screenplay.targets.Target TXT_MY_ACCOUNT = Target.the("Text of username in my account").located(By.xpath("//div[@class='uiview ng-scope']/section/article/h3"));

}
