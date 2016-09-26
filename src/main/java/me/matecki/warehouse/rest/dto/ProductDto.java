package me.matecki.warehouse.rest.dto;


public class ProductDto {

    private final Long productId;

    private final String name;

    private final Double quantity;

    public ProductDto(Long productId, String name, Double quantity) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }
}
