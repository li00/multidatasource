package p.lzf.quickexcel.service;

import org.springframework.stereotype.Service;
import p.lzf.quickexcel.mapper.employee.EmployeeMapper;
import p.lzf.quickexcel.model.Employee;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lzf on 2017/8/6.
 */
@Service
public class EmployeeImpService implements IEmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    public List<Employee> getEmpList() {
        return this.employeeMapper.getEmpList();
    }

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }
}
