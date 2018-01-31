package com.cn.inuyasha.ye.model.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 */
@RestController("simpleController")
@RequestMapping("/api/test/simple")
public class SimpleController {

    /**
     * 测试
     *
     * @return string
     */
    @RequestMapping(method = RequestMethod.GET)
    public String selectSimple() {
        return "测试";
    }


}
