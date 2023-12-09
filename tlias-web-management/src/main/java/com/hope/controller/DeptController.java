package com.hope.controller;

import com.hope.pojo.Dept;
import com.hope.pojo.Result;
import com.hope.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Slf4j
public class DeptController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);

    //@RequestMapping(value = "/depts", method = RequestMethod.GET)

    @Autowired
    private DeptService deptService;
    @GetMapping("/depts")
    public Result list() {

        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }
}
