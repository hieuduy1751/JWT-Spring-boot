package com.iuh.jwt.pttk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iuh.jwt.pttk.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Integer>{
    public Role findByName(String name);
}
