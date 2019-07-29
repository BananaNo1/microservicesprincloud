package com.springcloud.service;

import com.springcloud.cfgbeans.entity.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName HystrixFactoryImpl
 * @Description TODO
 * @Author leis
 * @Date 2019/7/29 9:35
 * @Version 1.0
 **/
@Component
@Slf4j
public class HystrixFactoryImpl implements DeptService {


    @Override
    public Boolean add(Dept dept) {
        log.info("**********Hello Hystrix**********");
        return null;
    }

    @Override
    public Dept get(Long id) {
        log.info("**********Hello Hystrix**********");
        return null;
    }

    @Override
    public List<Dept> list() {
        log.info("**********Hello Hystrix**********");
        return null;
    }

    @Override
    public Object discovery() {
        log.info("**********Hello Hystrix**********");
        return "hello hystrix";
    }
}
