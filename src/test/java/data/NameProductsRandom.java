package data;

import com.github.javafaker.Faker;

public class NameProductsRandom {

    Faker faker = new Faker();

    public String product = getRandomProduct();


    public String getRandomProduct() {
        String[] products = {"молоко","вода","шоколад"};
        return faker.options().option(products);
    }

}
