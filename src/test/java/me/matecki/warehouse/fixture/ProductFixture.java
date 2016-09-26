package me.matecki.warehouse.fixture;

import me.matecki.warehouse.model.Product;


public final class ProductFixture {

    private Long id;
    private String name;
    private Double quantity;

    private ProductFixture() {
    }

    public static ProductFixture aProduct() {
        return new ProductFixture();
    }

    public ProductFixture withId(Long id) {
        this.id = id;
        return this;
    }

    public ProductFixture withName(String name) {
        this.name = name;
        return this;
    }

    public ProductFixture withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setQuantity(quantity);
        return product;
    }
}
