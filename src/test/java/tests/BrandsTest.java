package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import pages.OurBrandPage;

public class BrandsTest extends TestBase {

    OurBrandPage brandPage = new OurBrandPage();

    @Test
    @Owner("")
    public void checkBrandsImageAndRef() {
        brandPage.openPage(brandPage.uri)
                .checkTitle(brandPage.titleName)
                .checkKundeBrand()
                .checkSummaryBrands();

    }




}
