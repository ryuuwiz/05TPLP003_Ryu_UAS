package dev.ryuuwiz.project_uas.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ryuuwiz.project_uas.dto.SilabusDto;
import dev.ryuuwiz.project_uas.dto.SilabusForm;
import dev.ryuuwiz.project_uas.dto.SilabusMapper;
import dev.ryuuwiz.project_uas.model.Silabus;
import dev.ryuuwiz.project_uas.repository.MataPelajaranRepo;
import dev.ryuuwiz.project_uas.repository.SilabusRepo;

@Service
public class SilabusService {

  @Autowired
  private SilabusRepo silabusRepo;

  @Autowired
  private MataPelajaranRepo mataPelajaranRepo;

  public void simpanSilabus(SilabusForm form) {
    Silabus x = new Silabus();
    x.setMataPelajaran(mataPelajaranRepo.findById(form.getId_mapel()).orElse(null));
    x.setJudul(form.getJudul());
    x.setDeskripsi(form.getDeskripsi());
    x.setTujuan(form.getTujuan());
    x.setMateri(form.getMateri());
    x.setMetode(form.getMetode());
    x.setEvaluasi(form.getEvaluasi());
    silabusRepo.save(x);
  }

  public List<SilabusDto> lihatSilabus() {
    return silabusRepo.findAll().stream().map(SilabusMapper::toSilabusDto).collect(Collectors.toList());
  }

  public void hapusSilabus(Integer id) {
    silabusRepo.deleteById(id);
  }
}
