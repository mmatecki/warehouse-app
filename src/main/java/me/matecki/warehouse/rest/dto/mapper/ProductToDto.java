package me.matecki.warehouse.rest.dto.mapper;

import me.matecki.warehouse.model.Product;
import me.matecki.warehouse.rest.dto.ProductDto;
import me.matecki.warehouse.rest.dto.ToDto;

public class ProductToDto implements ToDto<ProductDto, Product> {

    @Override
    public ProductDto toDto(Product from) {
        return new ProductDto(from.getId(), from.getName(), from.getQuantity());
    }
}
