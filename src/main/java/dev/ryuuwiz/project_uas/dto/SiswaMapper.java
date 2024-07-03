package dev.ryuuwiz.project_uas.dto;

import dev.ryuuwiz.project_uas.model.Siswa;

public class SiswaMapper {
  public static SiswaDto toSiswaDto(Siswa y) {
    SiswaDto x = new SiswaDto();
    x.setId(y.getId());
    x.setNisn(y.getNisn());
    x.setNama_lengkap(y.getNama_lengkap());
    x.setTanggal_lahir(y.getTanggal_lahir());
    x.setAlamat(y.getAlamat());
    x.setNama_ortu(y.getNama_ortu());
    x.setTelp(y.getTelp());
    x.setFoto(y.getFoto());
    x.setStatus(y.getStatus());
    return x;
  }

  public static Siswa toSiswa(SiswaDto y) {
    Siswa x = new Siswa();
    x.setNisn(y.getNisn());
    x.setNama_lengkap(y.getNama_lengkap());
    x.setTanggal_lahir(y.getTanggal_lahir());
    x.setAlamat(y.getAlamat());
    x.setNama_ortu(y.getNama_ortu());
    x.setTelp(y.getTelp());
    x.setFoto(y.getFoto());
    x.setStatus(y.getStatus());
    return x;
  }
}
