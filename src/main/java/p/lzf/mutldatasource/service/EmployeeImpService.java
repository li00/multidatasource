package p.lzf.mutldatasource.service;

import org.springframework.stereotype.Service;
import p.lzf.mutldatasource.mapper.employee.EmployeeMapper;
import p.lzf.mutldatasource.model.Employee;

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
