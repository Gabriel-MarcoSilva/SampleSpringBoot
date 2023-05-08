package com.devsuperior.devsuperior.repositors;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devsuperior.entites.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
    
}
