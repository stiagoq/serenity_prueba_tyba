package test.certificationlogin.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CharactersPc {
    public static final net.serenitybdd.screenplay.targets.Target BTN_QUANTITY_PC = Target.the("Button to select quantity").located(By.xpath("//div[@id='productProperties']/div[@class='smoolMargin']/e-sec-plus-minus/div/div[@class='plus']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_ADD_PC = Target.the("Button to select quantity").located(By.xpath("//div[@id='productProperties']/div[@class='fixedBtn']/button[@name='save_to_cart']"));

}
