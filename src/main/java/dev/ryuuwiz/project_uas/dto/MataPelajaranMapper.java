package dev.ryuuwiz.project_uas.dto;

import dev.ryuuwiz.project_uas.model.MataPelajaran;

public class MataPelajaranMapper {
  public static MataPelajaranDto toMataPelajaranDto(MataPelajaran y) {
    MataPelajaranDto x = new MataPelajaranDto();
    x.setId(y.getId());
    x.setKode_mapel(y.getKode_mapel());
    x.setNama_mapel(y.getNama_mapel());
    x.setTingkat(y.getTingkat());
    return x;
  }

  public static MataPelajaran toMataPelajaran(MataPelajaranDto y) {
    MataPelajaran x = new MataPelajaran();
    x.setId(y.getId());
    x.setKode_mapel(y.getKode_mapel());
    x.setNama_mapel(y.getNama_mapel());
    x.setTingkat(y.getTingkat());
    return x;
  }
}
