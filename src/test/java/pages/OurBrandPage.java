package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class OurBrandPage {
    public String titleName = "Наши бренды";


    SelenideElement title = $("div.brands"),
            kundeRef = $("[href='/brands/kunde?city=astana']"),
            kundeImage = $("[src='https://magnum.kz:1337/uploads/kunde_1_3e0f9cf74a.png']");


    @Step("Открытие страницы {value}")
    public OurBrandPage openPage() {
        open("/brands?city=astana");
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

    @Step("Проверка отобращения преимуществ")
    public void checkSummaryBrands() {
        $$("div.brands__info div div").shouldHave(texts("Собственная торговая марка",
                "Это широкий ассортимент качественных товаров по выгодным ценам: продукты питания, бытовая химия, товары для дома, текстиль и многое другое. Всё это произведено с любовью и заботой к нашим покупателям по заказу Magnum.",
                "Это выгодно!",
                "Мы обеспечиваем низкие цены на товары собственной марки благодаря прямому сотрудничеству с отечественными и иностранными производителями - без посредников и дополнительных расходов.",
                "Это качественно!",
                "Мы лично проводим аудит на производстве, оцениваем техническую документацию, проводим дегустации. Каждый продукт проходит обязательный контроль качества."));
    }

    @Step("Выбор бренда")
    public void selectBrand() {
        kundeImage.click();
    }

}
