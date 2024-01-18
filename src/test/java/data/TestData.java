package data;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();

    // Данные для SurveyTest
    public String city = getRandomCity(),
            product1 = getMissingProduct(),
            product2 = getMissingProduct(),
            other = "Другое";

    private String getRandomCity() {
        String[] city = {"Астана", "Алматы", "Караганда", "Петропавловск"};

        return faker.options().option(city);
    }

    private String getMissingProduct() {
        String[] product = {"Сахар 2кг", "Молоко 2л", "Сок 3л", "Мука 3кг"};

        return faker.options().option(product);
    }


    //Данные для ShopFindsTest
    public String shopName = "Назарбаев",
            summary = """
                    Daily
                    Magnum - НАЗАРБАЕВ УНИВЕРСИТЕТ
                    г. Астана, Кабанбай Батыра 53
                    Режим работы:09:00 - 23:00""";


    //Данные для HeaderComponent
    public String langKZ = "Қазақша",
            catalogName = "Жеңілдіктер каталогы";
    public String productName = getRandomProduct();


    private String getRandomProduct() {
        String[] products = {"молоко", "вода", "шоколад"};
        return faker.options().option(products);
    }


    //Данные для BurgerModal
    public String[] menu = {
            "Акции",
            "Каталог скидок",
            "Программа лояльности",
            "Готовим с Magnum",
            "Заказ с доставкой",
            "Магазины",
            "Magnum Corp.",
            "Контакты",
            "О компании",
            "Работа в Magnum",
            "Наши бренды",
            "Magnum News",
            "Служба Комплаенс",
            "Опрос по ассортименту"
    };


    //Данные для SurveyConfirmModal
    public String confirmText = "Спасибо за пройденный опрос";
}
