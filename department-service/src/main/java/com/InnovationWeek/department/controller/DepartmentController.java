package com.InnovationWeek.department.controller;

import com.InnovationWeek.department.entity.Department;
import com.InnovationWeek.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){

        log.info("Inside saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) throws Exception {

        log.info("Inside findDepartmentById method of DepartmentController");

        if(departmentId == null){
            throw new Exception("Exception raised in Department service");
        }
        return departmentService.findDepartmentById(departmentId);
    }
}
