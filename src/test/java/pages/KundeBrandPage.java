package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class KundeBrandPage {

    SelenideElement kundeTitle = $("h3.full-brand__title");


    public void checkKundetitle() {
        kundeTitle.shouldHave(text("«Kunde»")).shouldBe(visible);
    }
}
