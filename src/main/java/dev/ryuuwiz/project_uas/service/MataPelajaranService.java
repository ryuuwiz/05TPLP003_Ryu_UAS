package dev.ryuuwiz.project_uas.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ryuuwiz.project_uas.dto.MataPelajaranDto;
import dev.ryuuwiz.project_uas.dto.MataPelajaranMapper;
import dev.ryuuwiz.project_uas.repository.MataPelajaranRepo;

import java.util.stream.Collectors;

@Service
public class MataPelajaranService {

  @Autowired
  private MataPelajaranRepo mataPelajaranRepo;

  public void simpanMapel(MataPelajaranDto mataPelajaranDto) {
    mataPelajaranRepo.save(MataPelajaranMapper.toMataPelajaran(mataPelajaranDto));
  }

  public List<MataPelajaranDto> lihatMapel() {
    return mataPelajaranRepo.findAll().stream().map(MataPelajaranMapper::toMataPelajaranDto)
        .collect(Collectors.toList());
  }

  public void hapusMapel(Integer id) {
    mataPelajaranRepo.deleteById(id);
  }
}
