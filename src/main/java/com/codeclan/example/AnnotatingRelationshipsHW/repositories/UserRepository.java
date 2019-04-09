package com.codeclan.example.AnnotatingRelationshipsHW.repositories;

import com.codeclan.example.AnnotatingRelationshipsHW.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
