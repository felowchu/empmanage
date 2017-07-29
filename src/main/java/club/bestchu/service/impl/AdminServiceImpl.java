package club.bestchu.service.impl;

import club.bestchu.dao.AdminDao;
import club.bestchu.entity.Admin;
import club.bestchu.service.AdminService;

public class AdminServiceImpl implements AdminService{
    private AdminDao adminDao;
    @Override
    public void register(Admin admin) {
        adminDao.save(admin);
    }

    @Override
    public Admin login(Admin admin) {
        return adminDao.findByAdmin(admin);
    }

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }
}
