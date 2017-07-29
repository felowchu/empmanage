package club.bestchu.service;

import club.bestchu.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Employee emp);

    void update(Employee emp);

    void delete(int id);

    Employee findById(int id);

    List<Employee> getAll();

    List<Employee> getAll(String employeeName);

    void deleteMany(int[] ids);
}
