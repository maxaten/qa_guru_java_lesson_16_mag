package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.KundeBrandPage;
import pages.OurBrandPage;

public class BrandsTest extends TestBase {

    OurBrandPage brandPage = new OurBrandPage();
    KundeBrandPage kundePage = new KundeBrandPage();

    @Test
    @DisplayName("Проверка отображения бренда на общей странице")
    @Issue("HOMEWORK-944")
    @Owner("Maksim A")
    @Epic("Информация о партнерах")
    @Story("Просмотр информации о брендах на отдельной странице")
    @Tags({@Tag("smoke"),@Tag("regress")})
    public void checkBrandsImageAndRef() {
        brandPage.openPage()
                .checkTitle(brandPage.titleName)
                .checkKundeBrand()
                .checkSummaryBrands();

    }

    @Test
    @DisplayName("Переход на страницу бренда")
    @Issue("HOMEWORK-944")
    @Owner("Maksim A")
    @Epic("Информация о партнерах")
    @Story("Просмотр информации о брендах на отдельной странице")
    @Tags({@Tag("smoke"),@Tag("regress")})
    public void checkRefClick() {
        brandPage.openPage()
                .selectBrand();
        kundePage.checkKundetitle();
    }


}
