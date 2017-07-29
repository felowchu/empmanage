package club.bestchu.dao;

import club.bestchu.entity.Dept;

import java.util.List;

public interface DeptDao {
    List<Dept> getAll();

    Dept findById(int id);
}
