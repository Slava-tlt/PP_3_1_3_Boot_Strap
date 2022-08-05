package ru.kata.spring.boot_security.demo.DAO;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDAO {

    List<Role> getAllRoles();

    Set<Role> findRoles(List<Long> roles);
}