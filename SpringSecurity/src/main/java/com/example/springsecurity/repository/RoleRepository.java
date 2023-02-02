package com.example.springsecurity.repository;

import com.example.springsecurity.model.Role;
import com.example.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role,Long> {
    User findByRole(String name);
}
