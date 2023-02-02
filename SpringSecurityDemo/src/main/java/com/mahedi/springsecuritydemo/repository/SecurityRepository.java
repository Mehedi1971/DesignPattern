package com.mahedi.springsecuritydemo.repository;

import com.mahedi.springsecuritydemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository <User,Long>{
}
