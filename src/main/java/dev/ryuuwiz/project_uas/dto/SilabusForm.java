package dev.ryuuwiz.project_uas.dto;

import lombok.Data;

@Data
public class SilabusForm {
  private Integer id;
  private Integer id_mapel;
  private String judul;
  private String deskripsi;
  private String tujuan;
  private String materi;
  private String metode;
  private String evaluasi;
}
