package org.tis.bootstudy.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.tis.bootstudy.dao.EmployeeMapper;
import org.tis.bootstudy.entity.Employee;
import org.tis.bootstudy.service.IEmployeeService;

/**
 * description:
 *
 * @author zhaoch
 * @date 2018/4/19
 **/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {
}
