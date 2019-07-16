package com.qienys.JnuPrac.Controller;

import ch.qos.logback.core.util.COWArrayList;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qienys.JnuPrac.pojo.Product;
import com.qienys.JnuPrac.pojo.User;
import com.qienys.JnuPrac.service.ProductService;
import com.qienys.JnuPrac.service.impl.ProductServiceImpl;
import com.qienys.JnuPrac.util.MD5Utils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

@Controller
public class MallController {

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @RequestMapping(value = "/productlist", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getProductList(@RequestBody JSONObject jsonProduct){

        out.println(jsonProduct.toJSONString());
        JSONObject result = new JSONObject();
        List<Product> products = productServiceImpl.findAll();
        result.put("method", "json");
        result.put("data", products);

        return result.toJSONString();

    }


}
