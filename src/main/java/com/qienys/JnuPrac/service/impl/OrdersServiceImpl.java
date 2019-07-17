package com.qienys.JnuPrac.service.impl;

import com.qienys.JnuPrac.dao.OrdersRepository;
import com.qienys.JnuPrac.pojo.Orders;
import com.qienys.JnuPrac.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<Orders> findByUid(Long uid){
        List<Orders> ordersList = ordersRepository.findByUid(uid);
        return ordersList;
    }
}
