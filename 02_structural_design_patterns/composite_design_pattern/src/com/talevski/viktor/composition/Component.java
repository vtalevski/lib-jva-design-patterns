package com.talevski.viktor.composition;

public abstract class Component {
    private String catalogName;

    public Component() { /* Even though an abstract class cannot be instantiated, a default or no arguments constructor
                            is created because the product does not have a catalog name and it must propagate to
                            somewhere. A solution to this, to not have a default or no arguments constructor is to call
                            the constructor of this abstract class that has one parameter for the catalog name. Check
                            the Product class to see the modifications for this alternative solution. */
    }

    public Component(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void addProduct(Component product) {
        throw new UnsupportedOperationException("A product cannot be added.");
    }

    public void removeProduct(Component product) {
        throw new UnsupportedOperationException("A product cannot be removed.");
    }

    public abstract void showPrice();
}
