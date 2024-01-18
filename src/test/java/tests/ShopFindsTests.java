package tests;

import data.TestData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ShopsPage;


@Tag("shops")
public class ShopFindsTests extends TestBase {

    ShopsPage shops = new ShopsPage();

    TestData testData = new TestData();


    @Test
    @Tag("smoke")
    @DisplayName("Поиск магазина")
    public void searchStoreTest() {
        shops.openPage()
                .inputStore(testData.shopName);

        shops.checkInputStoreName(testData.shopName);
    }

    @Test
    @Tag("smoke")
    @DisplayName("Проверка описания магазина")
    public void descriptionShop() {
        shops.openPage()
                .inputStore(testData.shopName)
                .selectShop();

        shops.checkSummaryShop(testData.summary);
    }
}