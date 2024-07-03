package dev.ryuuwiz.project_uas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.ryuuwiz.project_uas.model.Silabus;
import jakarta.transaction.Transactional;

@Repository
public interface SilabusRepo extends JpaRepository<Silabus, Integer> {
  @Transactional
  void deleteById(int id);
}
