package dev.ryuuwiz.project_uas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.ryuuwiz.project_uas.model.BahanAjar;
import jakarta.transaction.Transactional;

@Repository
public interface BahanAjarRepo extends JpaRepository<BahanAjar, Integer> {
  @Transactional
  void deleteById(int id);
}
