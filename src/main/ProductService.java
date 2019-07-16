package com.qienys.JnuPrac.service;

import com.qienys.JnuPrac.pojo.Product;

public interface ProductService {
    Product findByName(String name);
}
