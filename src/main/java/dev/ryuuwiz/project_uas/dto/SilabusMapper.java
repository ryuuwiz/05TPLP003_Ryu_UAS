package dev.ryuuwiz.project_uas.dto;

import dev.ryuuwiz.project_uas.model.Silabus;

public class SilabusMapper {
  public static SilabusDto toSilabusDto(Silabus y) {
    SilabusDto x = new SilabusDto();
    x.setId(y.getId());
    x.setMataPelajaran(MataPelajaranMapper.toMataPelajaranDto(y.getMataPelajaran()));
    x.setJudul(y.getJudul());
    x.setDeskripsi(y.getDeskripsi());
    x.setTujuan(y.getTujuan());
    x.setMateri(y.getMateri());
    x.setMetode(y.getMetode());
    x.setEvaluasi(y.getEvaluasi());
    return x;
  }

  public static Silabus toSilabus(SilabusDto y) {
    Silabus x = new Silabus();
    x.setMataPelajaran(MataPelajaranMapper.toMataPelajaran(y.getMataPelajaran()));
    x.setJudul(y.getJudul());
    x.setDeskripsi(y.getDeskripsi());
    x.setTujuan(y.getTujuan());
    x.setMateri(y.getMateri());
    x.setMetode(y.getMetode());
    x.setEvaluasi(y.getEvaluasi());
    return x;
  }
}
