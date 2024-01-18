package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SurveyPage {


    private SelenideElement cityField = $(".interview__form .interview__select-value"),
            cityList = $(".interview .interview__select-list"),
            storeInput = $("[placeholder='Выберите магазин или введите его адрес']"),
            storeList = $(".active.interview__select-dropdown"),
            productInput = $("[placeholder='Укажите товары']"),
            checkboxProduct = $("[for='other']"),
            otherInput = $("[placeholder='Напишите другой вариант']"),
            submitButton = $("button.interview__btn");


    @Step("Открытие страницы опроса по товару")
    public SurveyPage openPage() {
        open("/interview");

        return this;
    }


    @Step("Выбор города {value}")
    public SurveyPage setCity(String value) {
        cityField.click();
        cityList.$(byText(value)).click();

        return this;
    }

    @Step("Выбор магазина из списка")
    public SurveyPage selectStoreAddress() {
        storeInput.click();
        storeList.$("li", 2).click();

        return this;
    }


    @Step("Выбор товара: {value1}, {value2} ")
    public SurveyPage setProduct(String value1, String value2) {
        productInput.setValue(value1).setValue(value2);

        return this;
    }

    @Step("Выбор категории товара: {value}")
    public SurveyPage setOther(String value) {
        checkboxProduct.click();
        otherInput.setValue(value);

        return this;
    }

    public void sendAnswerForSurvey() {
        submitButton.click();
    }
}