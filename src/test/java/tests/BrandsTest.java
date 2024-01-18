package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import pages.KundeBrandPage;
import pages.OurBrandPage;

public class BrandsTest extends TestBase {

    OurBrandPage brandPage = new OurBrandPage();
    KundeBrandPage kundePage = new KundeBrandPage();

    @Test
    @Owner("")
    public void checkBrandsImageAndRef() {
        brandPage.openPage(brandPage.uri)
                .checkTitle(brandPage.titleName)
                .checkKundeBrand()
                .checkSummaryBrands();

    }

    @Test
    public void checkRefClick() {
        brandPage.openPage(brandPage.uri)
                .selectBrand();
        kundePage.checkKundetitle();
    }


}
