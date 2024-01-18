package tests;

import data.TestData;
import io.qameta.allure.Epic;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import pages.ResultSearchPage;
import pages.components.BurgerModal;
import pages.components.HeaderComponent;


@Tag("header")
public class HeaderTests extends TestBase {

    HeaderComponent header = new HeaderComponent();
    ResultSearchPage resultSearchPage = new ResultSearchPage();
    BurgerModal burger = new BurgerModal();
    TestData testData = new TestData();


    @Test
    @DisplayName("Поиск продукта")
    @Tag("smoke")
    @Issue("HOMEWORK-944")
    @Owner("Maksim A")
    @Story("Хеддер")
    @Epic("Поиск")
    public void fillSearchFormTest() {
        header.openPage().
                productSearch(testData.productName);

        resultSearchPage.checkProduct(testData.productName);

    }

    @Test
    @Tag("regress")
    @DisplayName("Переключение языка на казахский")
    @Issue("HOMEWORK-944")
    @Owner("Maksim A")
    @Epic("Хеддер")
    @Story("Языки")
    public void switchLanguageKzTest() {
        header.openPage()
                .selectLanguage(testData.langKZ);

        header.checkLanguageKZ(testData.catalogName);
    }

    @Test
    @Tag("regress")
    @DisplayName("Проверка отображения элементов меню")
    @Issue("HOMEWORK-944")
    @Owner("Maksim A")
    @Epic("Хеддер")
    @Story("Меню")
    public void checkBurgerMenuTest() {
        header.openPage()
                .clickBurgerButton();

        burger.getBurgerMenu(testData.menu);
    }
}