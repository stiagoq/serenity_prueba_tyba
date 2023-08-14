package test.certificationlogin.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CharactersSpeaker {
    public static final net.serenitybdd.screenplay.targets.Target BTN_COLOR_SPEAKER = Target.the("Button to select color").located(By.xpath("//div[@id='productProperties']/div[@class='colors ng-scope']/div/span[ @id='bunny' and @title='PURPLE']"));

    //public static final net.serenitybdd.screenplay.targets.Target BTN_COLOR_SPEAKER = Target.the("Button to select color").located(By.xpath("//div[@id='productProperties']/div[@class='colors ng-scope']/div/span[ @id='rabbit' and @title='PURPLE']"));
   // public static final net.serenitybdd.screenplay.targets.Target TXT_QUANTITY_SPEAKER = Target.the("Input to select quantity").located(By.xpath("//div[@id='productProperties']/div[@class='smoolMargin']/e-sec-plus-minus/div/div[2]/input[@name='quantity']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_QUANTITY_SPEAKER = Target.the("Button to select quantity").located(By.xpath("//div[@id='productProperties']/div[@class='smoolMargin']/e-sec-plus-minus/div/div[@class='plus']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_ADD_SPEAKER = Target.the("Button to select quantity").located(By.xpath("//div[@id='productProperties']/div[@class='fixedBtn']/button[@name='save_to_cart']"));

}
