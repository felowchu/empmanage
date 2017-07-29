package club.bestchu.action;

import club.bestchu.entity.Dept;
import club.bestchu.entity.Employee;
import club.bestchu.service.DeptService;
import club.bestchu.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.interceptor.RequestAware;

import java.util.List;
import java.util.Map;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>, RequestAware{

    private EmployeeService employeeService;
    private DeptService deptService;

    private Map<String, Object> request;

    //模型驱动
    private int deptId;
    private Employee employee = new Employee();
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public int getDeptId() {
        return deptId;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public Employee getModel() {
        return employee;
    }

    public String viewAdd(){
        List<Dept> listDept = deptService.getAll();
        request.put("listDept", listDept);
        return "add";
    }

    public String list(){
        List<Employee> listEmp = employeeService.getAll();
        request.put("listEmp", listEmp);
        return "list";
    }


    public String save(){
        Dept dept = deptService.findById(deptId);
        employee.setDept(dept);
        employeeService.save(employee);
        return "listAction";
    }

    //修改员工信息
    public String viewUpdate(){
        int id = employee.getId();
        Employee emp = employeeService.findById(id);
        //数据回显
        ValueStack vs = ActionContext.getContext().getValueStack();
        List<Dept> listDept = deptService.getAll();
        vs.pop();
        vs.push(emp);
        request.put("listDept",listDept);
        return "edit";
    }

    public String update(){
        Dept dept = deptService.findById(deptId);
        employee.setDept(dept);
        employeeService.update(employee);
        return "listAction";
    }

    //删除员工信息

    public String delete(){
        int empId = employee.getId();
        employeeService.delete(empId);
        return "listAction";
    }
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }

    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }


}
