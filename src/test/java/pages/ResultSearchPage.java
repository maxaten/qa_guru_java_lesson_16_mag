package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ResultSearchPage {

    private SelenideElement foundProducts = $(".default-wrapper .search");


    @Step("Проверка отображения найденного продукта")
    public void checkProduct(String value) {
        foundProducts.shouldHave(Condition.text(value));
    }
}