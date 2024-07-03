package dev.ryuuwiz.project_uas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class MataPelajaran {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(unique = true)
  private String kode_mapel;
  private String nama_mapel;
  private String tingkat;

  @OneToMany(mappedBy = "mataPelajaran", cascade = CascadeType.ALL, orphanRemoval = true)
  Collection<Silabus> silabuses;

  @OneToOne(mappedBy = "mataPelajaran")
  private BahanAjar bahanAjar;
}
