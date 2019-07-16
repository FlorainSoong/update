package com.qienys.JnuPrac.dao;

import com.qienys.JnuPrac.pojo.Cart;
import com.sun.tools.javac.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Long> {
    List<Cart> findByUid(Long uid);

}
