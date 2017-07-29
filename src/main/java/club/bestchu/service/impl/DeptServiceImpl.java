package club.bestchu.service.impl;

import club.bestchu.dao.DeptDao;
import club.bestchu.entity.Dept;
import club.bestchu.service.DeptService;

import java.util.List;

public class DeptServiceImpl implements DeptService{
    private DeptDao deptDao;
    @Override
    public List<Dept> getAll() {
        return deptDao.getAll();
    }

    @Override
    public Dept findById(int id) {
        return deptDao.findById(id);
    }

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }
}
