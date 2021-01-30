package com.talevski.viktor.model;

import com.talevski.viktor.composition.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Catalog extends Component {
    private Integer parentCounter = 0;
    private Integer childCounter = 0;
    private List<Component> products;

    public Catalog(String catalogName) {
        super(catalogName);
        this.parentCounter = this.parentCounter + 1;
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(Component product) {
        this.childCounter = this.parentCounter + 1;
        this.products.add(product);
    }

    @Override
    public void removeProduct(Component product) {
        this.products.remove(product);
    }

    @Override
    public void showPrice() {
        System.out.println(super.getCatalogName() + ":");
        for (Component product : products) {
            if (product instanceof Catalog) {
                createTab(parentCounter);
            } else if (product instanceof Product) {
                createTab(childCounter);
            }

            product.showPrice();
        }
    }

    private void createTab(Integer counter) {
        IntStream.range(0, counter).forEach(singlePrint -> System.out.print("\t"));
    }
}
