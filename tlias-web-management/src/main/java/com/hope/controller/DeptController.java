package com.hope.controller;

import com.hope.pojo.Dept;
import com.hope.pojo.Result;
import com.hope.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/depts")
public class DeptController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);

    //@RequestMapping(value = "/depts", method = RequestMethod.GET)

    @Autowired
    private DeptService deptService;

    /**
     * 查询部门数据
     * @return
     */
    @GetMapping
    public Result list() {

        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    /**
     * 删除部门数据
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据id删除部门：{}", id);
        deptService.delete(id);
        return Result.success();
    }

    /***
     * 增加部门
     * @return
     */
    @PostMapping

    public Result add(@RequestBody Dept dept) {
        log.info("新增部门：{}", dept);
        deptService.add(dept);
        return  Result.success();
    }
}
