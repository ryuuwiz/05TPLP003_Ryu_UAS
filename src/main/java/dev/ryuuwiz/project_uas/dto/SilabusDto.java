package dev.ryuuwiz.project_uas.dto;

import lombok.Data;

@Data
public class SilabusDto {
  private Integer id;
  private MataPelajaranDto mataPelajaran;
  private String judul;
  private String deskripsi;
  private String tujuan;
  private String materi;
  private String metode;
  private String evaluasi;
}
