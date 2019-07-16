package com.qienys.JnuPrac.service;

import com.qienys.JnuPrac.pojo.Cart;
import com.sun.tools.javac.util.List;

public interface CartService {

    List<Cart> findByUid(Long uid);

}
