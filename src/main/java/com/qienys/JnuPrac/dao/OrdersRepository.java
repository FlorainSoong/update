package com.qienys.JnuPrac.dao;

import com.qienys.JnuPrac.pojo.Orders;
import com.sun.tools.javac.util.List;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders,Long> {

    List<Orders> findByUid(Long uid);

}
