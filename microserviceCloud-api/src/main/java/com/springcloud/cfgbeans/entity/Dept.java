package com.springcloud.cfgbeans.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author leis
 * @Descirption
 * @date 2018/12/1 22:45
 */


@Data
@NoArgsConstructor
public class Dept {
    private Long deptno;

    private String dname;

    private String dbSource;

    public Dept(Long deptno, String dname, String dbSource) {
        this.deptno = deptno;
        this.dname = dname;
        this.dbSource = dbSource;
    }

}