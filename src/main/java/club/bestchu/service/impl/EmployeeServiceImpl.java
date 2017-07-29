package club.bestchu.service.impl;

import club.bestchu.dao.EmployeeDao;
import club.bestchu.entity.Employee;
import club.bestchu.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;
    @Override
    public void save(Employee emp) {
        employeeDao.save(emp);
    }

    @Override
    public void update(Employee emp) {
        employeeDao.update(emp);
    }

    @Override
    public void delete(int id) {
        employeeDao.delete(id);
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public List<Employee> getAll(String employeeName) {
        return null;
    }

    @Override
    public void deleteMany(int[] ids) {
        if(ids != null && ids.length > 0){
            for(int id : ids){
                delete(id);
            }
        }
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
