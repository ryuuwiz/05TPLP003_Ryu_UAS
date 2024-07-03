package dev.ryuuwiz.project_uas.dto;

import lombok.Data;

@Data
public class BahanAjarDto {
  private Integer id;
  private MataPelajaranDto mataPelajaran;
  private String judul;
  private String deskripsi;
  private String tipe;
  private String file;
}
