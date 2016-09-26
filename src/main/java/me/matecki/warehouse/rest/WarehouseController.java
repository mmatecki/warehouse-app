package me.matecki.warehouse.rest;

import me.matecki.warehouse.rest.dto.ProductDto;
import me.matecki.warehouse.rest.dto.mapper.ProductToDto;
import me.matecki.warehouse.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {

    private final WarehouseService warehouseService;

    @Autowired
    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @RequestMapping("/product/{productId}")
    @ResponseBody
    public ProductDto getProduct(@PathVariable("productId") Long productId) {
        return new ProductToDto().toDto(warehouseService.getProduct(productId));
    }


}
