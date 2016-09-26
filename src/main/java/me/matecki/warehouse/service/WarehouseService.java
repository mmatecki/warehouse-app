package me.matecki.warehouse.service;


import me.matecki.warehouse.model.Product;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WarehouseService {

    public Product getProduct(Long id) {
        return new Product(id, "Product "+id, new Random().nextDouble()*100);
    }

}
