package tests;

import data.TestData;
import io.qameta.allure.Epic;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
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
    @Issue("HOMEWORK-944")
    @Owner("Maksim A")
    @Epic("Магазины")
    @Story("Поиск. Все что связано с поиском")
    public void searchStoreTest() {
        shops.openPage()
                .inputStore(testData.shopName);

        shops.checkInputStoreName(testData.shopName);
    }

    @Test
    @Tag("smoke")
    @DisplayName("Проверка описания магазина")
    @Issue("HOMEWORK-944")
    @Owner("Maksim A")
    @Epic("Магазины")
    @Story("Поиск. Все что связано с поиском")
    public void descriptionShop() {
        shops.openPage()
                .inputStore(testData.shopName)
                .selectShop();

        shops.checkSummaryShop(testData.summary);
    }
}