package com.codeclan.example.AnnotatingRelationshipsHW.repositories;

import com.codeclan.example.AnnotatingRelationshipsHW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
