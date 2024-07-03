package dev.ryuuwiz.project_uas.dto;

import dev.ryuuwiz.project_uas.model.BahanAjar;

public class BahanAjarMapper {
  public static BahanAjarDto toBahanAjarDto(BahanAjar y) {
    BahanAjarDto x = new BahanAjarDto();
    x.setId(y.getId());
    x.setMataPelajaran(MataPelajaranMapper.toMataPelajaranDto(y.getMataPelajaran()));
    x.setJudul(y.getJudul());
    x.setDeskripsi(y.getDeskripsi());
    x.setTipe(y.getTipe());
    x.setFile(y.getFile());
    return x;
  }

  public static BahanAjar toBahanAjar(BahanAjarDto y) {
    BahanAjar x = new BahanAjar();
    x.setMataPelajaran(MataPelajaranMapper.toMataPelajaran(y.getMataPelajaran()));
    x.setJudul(y.getJudul());
    x.setDeskripsi(y.getDeskripsi());
    x.setTipe(y.getTipe());
    x.setFile(y.getFile());
    return x;
  }
}
