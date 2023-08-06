package org.apache.dubbo.springboot.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.apache.dubbo.springboot.demo.DemoService;
import org.springframework.stereotype.Component;


/**
 * @author hjx
 * @date 2023/8/6 16:34
 */
@Component
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
