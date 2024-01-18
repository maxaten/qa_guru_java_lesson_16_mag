package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SurveyConfirmModal {
    SelenideElement surveyConfirmModal = $(".modal .club-modal");


    public void successfulConfirm(String value) {
        surveyConfirmModal.shouldHave(Condition.text(value));
    }
}