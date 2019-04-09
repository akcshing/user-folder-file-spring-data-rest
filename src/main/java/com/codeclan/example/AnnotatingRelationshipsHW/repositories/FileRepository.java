package com.codeclan.example.AnnotatingRelationshipsHW.repositories;

import com.codeclan.example.AnnotatingRelationshipsHW.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
