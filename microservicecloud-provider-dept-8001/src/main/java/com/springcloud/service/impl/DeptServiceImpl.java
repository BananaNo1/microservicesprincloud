package com.springcloud.service.impl;

import com.springcloud.service.DeptService;
import com.springcloud.dao.DeptMapper;
import com.springcloud.cfgbeans.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        int i = deptMapper.insertSelective(dept);
        return i > 0 ? true : false;
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}
