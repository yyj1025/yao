package com.yao.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
    @GetMapping(value="/api/doit")
    public String doit(){
        //测试的一个项目
        return "doit_ok";
        }
}
