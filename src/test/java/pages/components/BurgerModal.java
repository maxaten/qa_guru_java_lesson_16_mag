package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class BurgerModal {

    private SelenideElement burgerModal = $(".header-menu .header-menu__content");


    @Step("Отображаются элементы меню")
    public void getBurgerMenu(String... values) {
        for (String value : values) {
            burgerModal.shouldHave(Condition.text(value));
        }
    }
}