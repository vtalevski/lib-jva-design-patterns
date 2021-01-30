package com.talevski.viktor;

import com.talevski.viktor.composition.Component;
import com.talevski.viktor.model.Catalog;
import com.talevski.viktor.model.Product;

/**
 * Reference link for the Composite Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/composite-pattern'.
 */
public class CompositeDesignPatternApplication {
    public static void main(String[] args) {
        Component gamingCatalog = createGamingCatalog();
        Component phoneCatalog = createPhoneCatalog();
        Component tvCatalog = createTvCatalog();

        Component mainCatalog = createMainCatalog(gamingCatalog, phoneCatalog, tvCatalog);

        mainCatalog.showPrice();
    }

    private static Component createGamingCatalog() {
        Component gamingCatalog = new Catalog("Gaming Catalog");

        Component nintendo = new Product("Nintendo", 300);
        Component sonyPlaystation = new Product("Sony Playstation", 500);

        gamingCatalog.addProduct(nintendo);
        gamingCatalog.addProduct(sonyPlaystation);

        return gamingCatalog;
    }

    private static Component createPhoneCatalog() {
        Component phoneCatalog = new Catalog("Phone Catalog");

        Component phoneApple = new Product("Phone Apple", 1000);
        Component phoneHuawei = new Product("Phone Huawei", 700);
        Component phoneSamsung = new Product("Phone Samsung", 800);

        phoneCatalog.addProduct(phoneApple);
        phoneCatalog.addProduct(phoneHuawei);
        phoneCatalog.addProduct(phoneSamsung);

        return phoneCatalog;
    }

    private static Component createTvCatalog() {
        Component tvCatalog = new Catalog("TV Catalog");

        Component tvSamsung = new Product("TV Samsung", 2000);
        Component tvSony = new Product("TV Sony", 2200);
        Component tvToshiba = new Product("TV Toshiba", 1700);

        tvCatalog.addProduct(tvSamsung);
        tvCatalog.addProduct(tvSony);
        tvCatalog.addProduct(tvToshiba);

        return tvCatalog;
    }

    private static Component createMainCatalog(Component gamingCatalog, Component phoneCatalog, Component tvCatalog) {
        Component mainCatalog = new Catalog("Main Catalog");
        mainCatalog.addProduct(gamingCatalog);
        mainCatalog.addProduct(phoneCatalog);
        mainCatalog.addProduct(tvCatalog);
        return mainCatalog;
    }
}
