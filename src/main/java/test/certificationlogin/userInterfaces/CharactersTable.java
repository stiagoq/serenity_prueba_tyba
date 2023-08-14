package test.certificationlogin.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CharactersTable {
    public static final net.serenitybdd.screenplay.targets.Target BTN_COLOR_TABLE = Target.the("Button to select color").located(By.xpath("//div[@id='productProperties']/div[@class='colors ng-scope']/div/span[@title='GRAY']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_QUANTITY_TABLE = Target.the("Button to select quantity").located(By.xpath("//div[@id='productProperties']/div[@class='smoolMargin']/e-sec-plus-minus/div/div[@class='plus']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_ADD_TABLE = Target.the("Button to select quantity").located(By.xpath("//div[@id='productProperties']/div[@class='fixedBtn']/button[@name='save_to_cart']"));

}
