package club.bestchu.dao.impl;

import club.bestchu.dao.EmployeeDao;
import club.bestchu.entity.Employee;
import org.hibernate.SessionFactory;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void delete(int id){
        sessionFactory.getCurrentSession().createQuery("delete from Employee where id=?")
                .setParameter(0,id).executeUpdate();
    }

    public Employee findById(int id){
        return sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    public List<Employee> getAll(){
        return sessionFactory.getCurrentSession().createQuery("from Employee").list();
    }

    @Override
    public List<Employee> getAll(String employeeName) {
        return sessionFactory.getCurrentSession().createQuery("from Employee where empName like ?")
                .setParameter(0, "%" + employeeName + "%").list();
    }

    public void save(Employee emp){
        sessionFactory.getCurrentSession().save(emp);
    }

    @Override
    public void update(Employee emp) {
        sessionFactory.getCurrentSession().update(emp );
    }

}
