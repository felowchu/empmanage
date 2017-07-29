package club.bestchu.dao.impl;

import club.bestchu.dao.AdminDao;
import club.bestchu.entity.Admin;
import org.hibernate.SessionFactory;

public class AdminDaoImpl implements AdminDao{

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Admin admin) {
        sessionFactory.getCurrentSession().save(admin);
    }

    @Override
    public Admin findByAdmin(Admin admin) {
        return (Admin) sessionFactory.getCurrentSession().createQuery("from Admin where adminName=? and pwd=?")
                .setParameter(0, admin.getAdminName()).setParameter(1,admin.getPwd()).uniqueResult();
    }

}
