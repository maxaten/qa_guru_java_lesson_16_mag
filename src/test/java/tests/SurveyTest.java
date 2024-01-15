package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SurveyPage;
import pages.components.SurveyConfirmModal;


@Tag("survey")
public class SurveyTest extends TestBase {

    SurveyPage survey = new SurveyPage();
    SurveyConfirmModal confirm = new SurveyConfirmModal();


    @Test
    @Disabled("Задизейблено, чтобы не спамить письмами в БД")
    @Tag("smoke")
    @DisplayName("Отправка обратной связи по недостающему товару")
    public void fillSurveyFormTest() {
        survey.openPage(survey.uri)
                .setCity(survey.city)
                .chooseStoreAddress()
                .setProduct(survey.product1, survey.product2)
                .setOther(survey.other)
                .sendAnswerForSurvey();

        confirm.successfulConfirm(confirm.confirmText);
    }
}