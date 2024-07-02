package dev.ryuuwiz.project_uas.dto;

import lombok.Data;

@Data
public class SiswaDto {
  private int id;
  private String nisn;
  private String nama_lengkap;
  private String tanggal_lahir;
  private String alamat;
  private String nama_ortu;
  private String telp;
  private String foto;
  private Boolean status;
}
