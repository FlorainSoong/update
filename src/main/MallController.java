package com.qienys.JnuPrac.Controller;

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
        Product product = JSON.parseObject(jsonProduct.toJSONString(),Product.class);
        Product productInfo = productServiceImpl.findByName(product.getName());
        out.println(productInfo.getName());
        result.put("name", product.getName());
        result.put("description",product.getDescription());
        result.put("price", product.getPrice());
        result.put("brand", product.getBrand());
        result.put("sold",product.getSold());
        result.put("stock", product.getStock());
        result.put("product type", product.getProductType());

        return result.toJSONString();

    }


}
