package club.bestchu.dao;

import club.bestchu.entity.Admin;

public interface AdminDao {
    void save(Admin admin);

    Admin findByAdmin(Admin admin);
}
