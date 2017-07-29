package club.bestchu.service;

import club.bestchu.entity.Admin;

public interface AdminService {
    void register(Admin admin);

    Admin login(Admin admin);
}
