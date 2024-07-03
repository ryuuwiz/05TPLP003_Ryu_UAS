package dev.ryuuwiz.project_uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.ryuuwiz.project_uas.dto.MataPelajaranDto;
import dev.ryuuwiz.project_uas.service.MataPelajaranService;

@Controller
@RequestMapping("mapel")
public class MataPelajaranController {

  @Autowired
  private MataPelajaranService mataPelajaranService;

  @PostMapping("simpan")
  public String simpan(MataPelajaranDto mataPelajaranDto) {
    mataPelajaranService.simpanMapel(mataPelajaranDto);
    return "redirect:/mapel";
  }

  @GetMapping("hapus/{id}")
  public String hapus(@PathVariable("id") Integer id) {
    mataPelajaranService.hapusMapel(id);
    return "redirect:/mapel";
  }
}
