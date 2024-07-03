package dev.ryuuwiz.project_uas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.ryuuwiz.project_uas.model.MataPelajaran;

@Repository
public interface MataPelajaranRepo extends JpaRepository<MataPelajaran, Integer> {

}
