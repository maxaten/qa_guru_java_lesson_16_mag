package tests;

import data.TestData;
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
    public void fillSearchFormTest() {
        header.openPage().
                productSearch(testData.productName);

        resultSearchPage.checkProduct(testData.productName);

    }

    @Test
    @Tag("regress")
    @DisplayName("Переключение языка на казахский")
    public void switchLanguageKzTest() {
        header.openPage()
                .selectLanguage(testData.langKZ);

        header.checkLanguageKZ(testData.catalogName);
    }

    @Test
    @Tag("regress")
    @DisplayName("Проверка отображения элементов меню")
    public void checkBurgerMenuTest() {
        header.openPage()
                .clickBurgerButton();

        burger.getBurgerMenu(testData.menu);
    }
}