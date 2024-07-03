package dev.ryuuwiz.project_uas.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dev.ryuuwiz.project_uas.dto.BahanAjarDto;
import dev.ryuuwiz.project_uas.dto.BahanAjarForm;
import dev.ryuuwiz.project_uas.dto.BahanAjarMapper;
import dev.ryuuwiz.project_uas.model.BahanAjar;
import dev.ryuuwiz.project_uas.repository.BahanAjarRepo;
import dev.ryuuwiz.project_uas.repository.MataPelajaranRepo;

@Service
public class BahanAjarService {

  @Autowired
  private BahanAjarRepo bahanAjarRepo;

  @Autowired
  private MataPelajaranRepo mataPelajaranRepo;

  public void simpanAjar(BahanAjarForm form, MultipartFile file) {
    BahanAjar x = new BahanAjar();
    x.setMataPelajaran(mataPelajaranRepo.findById(form.getId_mapel()).orElse(null));
    x.setJudul(form.getJudul());
    x.setDeskripsi(form.getDeskripsi());
    x.setTipe(form.getTipe());

    try {
      x.setFile(Base64.getEncoder().encodeToString(file.getBytes()));
    } catch (IOException e) {
      e.printStackTrace();
    }

    bahanAjarRepo.save(x);
  }

  public List<BahanAjarDto> lihatAjar() {
    return bahanAjarRepo.findAll().stream().map(BahanAjarMapper::toBahanAjarDto).collect(Collectors.toList());
  }

  public void hapusAjar(Integer id) {
    bahanAjarRepo.deleteById(id);
  }
}
