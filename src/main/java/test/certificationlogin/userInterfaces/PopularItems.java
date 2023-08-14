package test.certificationlogin.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopularItems {
    public static final net.serenitybdd.screenplay.targets.Target BTN_VIEW_TABLE = Target.the("Button to view table").located(By.xpath("//div[@class='grid-table center']/div[@name='popular_item_16']/a"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_VIEW_PC = Target.the("Button to view pc").located(By.xpath("//div[@class='grid-table center']/div[@name='popular_item_10']/a"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_VIEW_SPEAKER = Target.the("Button to view speaker").located(By.xpath("//div[@class='grid-table center']/div[@name='popular_item_21']/a"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_SHOPPING_CART = Target.the("Text of successful add cart").located(By.xpath("//nav/ul/li[2]/a[@id='shoppingCartLink']"));

}
