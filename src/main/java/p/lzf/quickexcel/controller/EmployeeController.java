package p.lzf.quickexcel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import p.lzf.quickexcel.model.Employee;
import p.lzf.quickexcel.model.User;
import p.lzf.quickexcel.service.IEmployeeService;
import p.lzf.quickexcel.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by  on 2017/8/6.
 */
@Controller
@RequestMapping("emp")
public class EmployeeController {
    @Resource
    private IEmployeeService iEmployeeService;
    @Resource
    private IUserService iUserService;

    @GetMapping(value = "getEmpList")
    public String getEmpList(Model model){
        List<User> user = iUserService.getUserList();
        List<Employee> emp = iEmployeeService.getEmpList();
        model.addAttribute("empList",emp);
        model.addAttribute("userList",user);
        return "show";
    }

    public void setiEmployeeService(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }

    public void setiUserService(IUserService iUserService) {
        this.iUserService = iUserService;
    }
}
