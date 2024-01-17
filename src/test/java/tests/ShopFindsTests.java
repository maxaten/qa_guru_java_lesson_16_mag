package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ShopsPage;


@Tag("shops")
public class ShopFindsTests extends TestBase {

    ShopsPage shops = new ShopsPage();


    @Test
    @Tag("smoke")
    @DisplayName("Поиск магазина")
    public void searchStoreTest() {
        shops.openPage(shops.uri)
                .inputStore(shops.shopName);

        shops.checkInputStoreName(shops.shopName);
    }

    @Test
    @Tag("smoke")
    @DisplayName("Проверка описания магазина")
    public void descriptionShop() {
        shops.openPage(shops.uri)
                .inputStore(shops.shopName)
                .selectShop();

        shops.checkSummaryShop(shops.summary);
    }
}