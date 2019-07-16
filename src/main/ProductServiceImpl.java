package com.qienys.JnuPrac.service.impl;

import com.qienys.JnuPrac.dao.ProductRepository;
import com.qienys.JnuPrac.pojo.Product;
import com.qienys.JnuPrac.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findByName(String name){
        Product product = productRepository.findByName(name);
        return product;
    }

}
