package com.InnovationWeek.department.service;


import com.InnovationWeek.department.entity.Department;
import com.InnovationWeek.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {

        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }


    public Department findDepartmentById(Long departmentId){
//        long tempvalue = 11;
        log.info("Inside findDepartmentById method of DepartmentService");
//        if(departmentId != null){
//            throw new Exception("test exception");
//        }

        return departmentRepository.findByDepartmentId(departmentId);
    }
}
