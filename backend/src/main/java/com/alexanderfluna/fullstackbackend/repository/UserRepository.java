package com.alexanderfluna.fullstackbackend.repository;

import com.alexanderfluna.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
