package club.bestchu.dao.impl;

import club.bestchu.dao.DeptDao;
import club.bestchu.entity.Dept;
import org.hibernate.SessionFactory;

import java.util.List;

public class DeptDaoImpl implements DeptDao{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Dept findById(int id){
        return (Dept)sessionFactory.getCurrentSession().get(Dept.class, id);
    }

    public List<Dept> getAll(){
        return (List<Dept>) sessionFactory.getCurrentSession().createQuery("from Dept").list();
    }
}
