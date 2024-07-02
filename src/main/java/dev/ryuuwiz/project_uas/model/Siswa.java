package dev.ryuuwiz.project_uas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Siswa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(unique = true)
  private String nisn;

  private String nama_lengkap;

  private String tanggal_lahir;

  private String alamat;

  private String nama_ortu;

  private String telp;

  @Lob
  @Column(columnDefinition = "MEDIUMBLOB")
  private String foto;

  private Boolean status;
}
