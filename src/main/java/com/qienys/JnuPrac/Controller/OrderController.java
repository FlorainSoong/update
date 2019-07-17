package com.qienys.JnuPrac.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qienys.JnuPrac.pojo.Orders;
import com.qienys.JnuPrac.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static java.lang.System.out;

public class OrderController {

    @Autowired
    private OrdersServiceImpl ordersServiceImpl;

    @RequestMapping(value = "/orderslist", method = RequestMethod.GET, produces = "application/json;charset = UTF-8")
    @ResponseBody
    public String getOrdersList(@RequestBody JSONObject jsonOrders){
        out.println(jsonOrders.toJSONString());
        JSONObject result = new JSONObject();
        Orders orders = JSON.parseObject(jsonOrders.toJSONString(),Orders.class);
        List<Orders> ordersList = ordersServiceImpl.findByUid(orders.getUid());
        result.put("method", "json");
        result.put("data",ordersList);

        return result.toJSONString();
    }
}
