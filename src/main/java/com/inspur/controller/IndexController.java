package com.inspur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: YANG
 * Date: 2019/6/10-21:21
 * Description: No Description
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "indexController";
    }

}
