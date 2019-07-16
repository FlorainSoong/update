package com.qienys.JnuPrac.dao;

import com.qienys.JnuPrac.pojo.Product;
import com.sun.tools.javac.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {

        Product findByName (String name);
        List<Product> findAll ();
}
