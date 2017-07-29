package club.bestchu.service;

import club.bestchu.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getAll();

    Dept findById(int id);
}
