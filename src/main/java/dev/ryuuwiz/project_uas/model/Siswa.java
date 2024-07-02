package dev.ryuuwiz.project_uas.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Siswa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(unique = true)
  private String nisn;

  private String nama_lengkap;

  @Temporal(TemporalType.DATE)
  private Date tanggal_lahir;

  private String alamat;

  private String nama_ortu;

  private String telp;

  @Lob
  private String foto;

  private Boolean status;
}
