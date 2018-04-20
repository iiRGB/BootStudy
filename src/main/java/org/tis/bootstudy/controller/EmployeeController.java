package org.tis.bootstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.tis.bootstudy.entity.Employee;
import org.tis.bootstudy.service.IEmployeeService;

/**
 * description:
 *
 * @author zhaoch
 * @date 2018/4/19
 **/
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @PostMapping("/add")
    public String add(@RequestBody @Validated Employee emp) {
        employeeService.insert(emp);
        return "新增成功！";
    }

    @PutMapping
    public String update(@RequestBody @Validated Employee emp) {
        employeeService.updateById(emp);
        return "修改成功！";
    }

}
