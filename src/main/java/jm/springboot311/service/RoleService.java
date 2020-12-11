package jm.springboot311.service;

import jm.springboot311.model.Role;

import java.util.Set;

public interface RoleService {
    void createRoles(Set<Role> roles);
    Set<Role> getAllRoles();
}
