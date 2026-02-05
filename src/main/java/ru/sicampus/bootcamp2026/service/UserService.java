package ru.sicampus.bootcamp2026.service;


import ru.sicampus.bootcamp2026.entity.User;

public interface UserService {
    User getById(Long id);

    User getByEmail(String email);
}
