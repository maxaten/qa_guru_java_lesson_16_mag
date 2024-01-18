package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ShopsPage {
    private SelenideElement storesSearchInput = $("input.map-card__search-input"),
            firstStoreOnTheList = $(".map-card .map-address"),
            textSummary = $("div.address-card__descr"),
            shopList = $("div.map-address__descr");


    @Step("Открытие страницы")
    public ShopsPage openPage() {
        open("/shops?city=astana");
        return this;
    }

    @Step("Ввод {value} в поле 'адрес магазина'")
    public ShopsPage inputStore(String value) {
        storesSearchInput.setValue(value);
        return this;
    }

    @Step("Проверка отображения магазина в списке с адресом: {value}")
    public void checkInputStoreName(String value) {
        firstStoreOnTheList.shouldHave(Condition.text(value));
    }

    @Step("Выбор магазина в списке")
    public void selectShop() {
        shopList.$("div", 1).click();
    }

    @Step("Проверка описания магазина")
    public void checkSummaryShop(String value) {
        textSummary.shouldHave(Condition.text(value));
    }
}