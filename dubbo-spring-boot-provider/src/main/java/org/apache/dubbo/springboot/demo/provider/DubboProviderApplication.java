package org.apache.dubbo.springboot.demo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hjx
 * @date 2023/8/6 16:36
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class,args);
    }
}
