package tests;

import data.TestData;
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
    TestData testData = new TestData();

    @Test
    @Disabled("Задизейблено, чтобы не спамить письмами в БД")
    @Tag("smoke")
    @DisplayName("Отправка обратной связи по недостающему товару")
    public void fillSurveyFormTest() {
        survey.openPage()
                .setCity(testData.city)
                .selectStoreAddress()
                .setProduct(testData.product1, testData.product2)
                .setOther(testData.other)
                .sendAnswerForSurvey();

        confirm.successfulConfirm(testData.confirmText);
    }
}