package com.posgraduacao.backendproject2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.posgraduacao.backendproject2.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
