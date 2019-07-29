package com.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.cfgbeans.entity.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author leis
 * @Descirption
 * @date 2018/12/9 10:15
 */

@RestController
public class DeptControllerConsumer {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @RequestMapping("/consumer/dept/discovery")
    public Object discovery() {
        return deptService.discovery();
    }

}