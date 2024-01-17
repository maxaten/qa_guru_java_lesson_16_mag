package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class OurBrandPage {
    public String titleName = "Наши бренды";


    public String uri = "/brands?city=astana";


    SelenideElement title = $("div.brands"),
            kundeRef = $("[href='/brands/kunde?city=astana']"),
            kundeImage = $("[src='https://magnum.kz:1337/uploads/kunde_1_3e0f9cf74a.png']"),
    ownBrandTitle = $("");



    @Step("Открытие страницы {value}")
    public OurBrandPage openPage(String value) {
        open(value);
        return this;
    }


    @Step("Проверка заголовка страницы")
    public OurBrandPage checkTitle(String value) {
        title.shouldHave(text(value))
                .shouldBe(visible);
        return this;
    }


    @Step("Проверка отображения бренда ")
    public OurBrandPage checkKundeBrand() {
        kundeRef.shouldHave();
        kundeImage.shouldBe(visible);
        return this;
    }

    @Step("")
    public void checkSummaryBrands() {
//        $("div.brands__info").shouldHave(text("Собственная торговая марка"));
        $$("div.brands__info div").first().shouldHave(text("Собственная торговая марка"));
        $("div.brands__info div").$(byText("Собственная торговая марка")).shouldBe(visible);
        $("div.brands__info div").$(byText("Это широкий ассортимент качественных товаров по выгодным ценам: продукты питания, бытовая химия, товары для дома, текстиль и многое другое. Всё это произведено с любовью и заботой к нашим покупателям по заказу Magnum.")).shouldBe(visible);
    }


}
