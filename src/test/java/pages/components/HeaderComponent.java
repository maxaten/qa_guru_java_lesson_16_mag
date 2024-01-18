package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HeaderComponent {
    private SelenideElement burgerButton = $(".burger .burger-top"),
            inputSearch = $(".header [type='text']"),
            language = $(".header .header-top__language"),
            dropLanguageMenu = $(".header .header-top__language"),
            catalog = $(".header-nav .catalog-stocks-link");


    @Step("Открытие страницы {value} ")
    public HeaderComponent openPage() {
        open("/?city=astana");

        return this;
    }

    @Step("Ввод продукта: {value}")
    public void productSearch(String value) {
        inputSearch.setValue(value).submit();
    }


    @Step("Выбор казахского языка")
    public void selectLanguage(String value) {
        language.click();
        dropLanguageMenu.$(byText(value)).click();
    }

    @Step("Проверка смена названия каталога на: {value}")
    public void checkLanguageKZ(String value) {
        catalog.shouldHave(Condition.text(value));
    }

    @Step("Открытие бургер-меню")
    public void clickBurgerButton() {
        burgerButton.click();
    }
}