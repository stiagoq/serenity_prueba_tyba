package test.certificationlogin.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCart {
    public static final net.serenitybdd.screenplay.targets.Target BTN_CHECKOUT = Target.the("Button to checkout").located(By.xpath("//div[@id='shoppingCart']/table/tfoot/tr[2]/td/button[@name='check_out_btn']"));

}
