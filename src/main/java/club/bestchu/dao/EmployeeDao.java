package club.bestchu.dao;

import club.bestchu.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    void save(Employee emp);

    void update(Employee emp);

    void delete(int id);

    Employee findById(int id);

    List<Employee> getAll();

    List<Employee> getAll(String employeeName);
}
