package com.inspur.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: YANG
 * Date: 2019/6/10-21:30
 * Description: No Description
 */
@RestController
public class OrderController {

    @RequestMapping("/orderIndex")
    public String index(){
        return "orderController";
    }
}
