package dev.ryuuwiz.project_uas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Silabus {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @ManyToOne()
  @JoinColumn(name = "id_mapel")
  private MataPelajaran mataPelajaran;
  private String judul;
  private String deskripsi;
  private String tujuan;
  private String materi;
  private String metode;
  private String evaluasi;
}
