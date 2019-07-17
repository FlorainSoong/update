package com.qienys.JnuPrac.service;

import com.qienys.JnuPrac.pojo.Orders;

import java.util.List;


public interface OrdersService {
    List<Orders> findByUid(Long uid);
}
