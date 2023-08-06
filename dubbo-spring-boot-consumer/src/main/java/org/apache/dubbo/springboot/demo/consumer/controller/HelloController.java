package org.apache.dubbo.springboot.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.dubbo.springboot.demo.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjx
 * @date 2023/8/6 16:49
 */
@RestController
public class HelloController {

    @Reference
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = demoService.sayHello("world");
        System.out.println(demoService.sayHello("dubbo"));
        return hello;
    }
}
