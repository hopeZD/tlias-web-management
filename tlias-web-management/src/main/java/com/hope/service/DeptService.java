package com.hope.service;

import com.hope.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询全部部门数据
     * @return
     */

    List<Dept> list();
}
