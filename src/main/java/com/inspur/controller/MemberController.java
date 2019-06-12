package com.inspur.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: YANG
 * Date: 2019/6/10-21:05
 * Description: No Description
 */
@RestController
public class MemberController {

    @RequestMapping("/memberIndex")
    public String memberIndex() {
        return "SpringBoot2.0";
    }

}
