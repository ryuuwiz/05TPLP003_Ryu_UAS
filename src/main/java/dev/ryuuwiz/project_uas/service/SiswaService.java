package dev.ryuuwiz.project_uas.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dev.ryuuwiz.project_uas.dto.SiswaDto;
import dev.ryuuwiz.project_uas.dto.SiswaMapper;
import dev.ryuuwiz.project_uas.repository.SiswaRepo;

@Service
public class SiswaService {

  @Autowired
  private SiswaRepo siswaRepo;

  public void simpanSiswa(SiswaDto siswaDto, MultipartFile file) {
    try {
      siswaDto.setFoto(Base64.getEncoder().encodeToString(file.getBytes()));
      siswaRepo.save(SiswaMapper.toSiswa(siswaDto));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<SiswaDto> lihatSiswa() {
    return siswaRepo.findAll().stream().map(SiswaMapper::toSiswaDto).collect(Collectors.toList());
  }

  public void hapusSiswa(Integer id) {
    siswaRepo.deleteById(id);
  }
}
