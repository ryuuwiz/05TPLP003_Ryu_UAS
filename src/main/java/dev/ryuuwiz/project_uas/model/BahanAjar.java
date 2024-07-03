package dev.ryuuwiz.project_uas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class BahanAjar {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_mapel", referencedColumnName = "id")
  private MataPelajaran mataPelajaran;
  private String judul;
  private String deskripsi;
  private String tipe;
  @Lob
  @Column(columnDefinition = "MEDIUMBLOB")
  private String file;
}
