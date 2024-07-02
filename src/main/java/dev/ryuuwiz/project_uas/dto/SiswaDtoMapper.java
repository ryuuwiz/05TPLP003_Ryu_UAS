package dev.ryuuwiz.project_uas.dto;

import dev.ryuuwiz.project_uas.model.Siswa;

public class SiswaDtoMapper {
  public static SiswaDto toSiswaDto(Siswa siswa) {
    SiswaDto x = new SiswaDto();
    x.setId(siswa.getId());
    x.setNisn(siswa.getNisn());
    x.setNama_lengkap(siswa.getNama_lengkap());
    x.setTanggal_lahir(siswa.getTanggal_lahir());
    x.setAlamat(siswa.getAlamat());
    x.setNama_ortu(siswa.getNama_ortu());
    x.setTelp(siswa.getTelp());
    x.setFoto(siswa.getFoto());
    x.setStatus(siswa.getStatus());
    return x;
  }

  public static Siswa toSiswa(SiswaDto siswaDto) {
    Siswa x = new Siswa();
    x.setId(siswaDto.getId());
    x.setNisn(siswaDto.getNisn());
    x.setNama_lengkap(siswaDto.getNama_lengkap());
    x.setTanggal_lahir(siswaDto.getTanggal_lahir());
    x.setAlamat(siswaDto.getAlamat());
    x.setNama_ortu(siswaDto.getNama_ortu());
    x.setTelp(siswaDto.getTelp());
    x.setFoto(siswaDto.getFoto());
    x.setStatus(siswaDto.getStatus());
    return x;
  }
}
