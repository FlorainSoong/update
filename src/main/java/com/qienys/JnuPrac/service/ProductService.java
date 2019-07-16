package com.qienys.JnuPrac.service;

import com.qienys.JnuPrac.pojo.Product;
import com.sun.tools.javac.util.List;

public interface ProductService {
    Product findByName(String name);
    List<Product> findAll ();

}
