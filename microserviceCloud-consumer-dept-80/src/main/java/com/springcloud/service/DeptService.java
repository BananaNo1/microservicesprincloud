package com.springcloud.service;

import com.springcloud.cfgbeans.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName DeptService
 * @Description value 服务提供者的注册服务名称
 * @Author aisino
 * @Date 2019/7/23
 **/
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallback = HystrixFactoryImpl.class)
public interface DeptService {

    /**
     * 请求路径是提供者的路径
     *
     * @param dept
     * @return
     */
    @RequestMapping("/dept/add")
    Boolean add(Dept dept);

    @RequestMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @RequestMapping("/dept/list")
    List<Dept> list();

    @RequestMapping("/dept/discovery")
    Object discovery();
}
