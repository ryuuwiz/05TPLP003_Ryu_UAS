package dev.ryuuwiz.project_uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import dev.ryuuwiz.project_uas.dto.SiswaDto;
import dev.ryuuwiz.project_uas.service.SiswaService;

@Controller
@RequestMapping("siswa")
public class SiswaController {

  @Autowired
  private SiswaService siswaService;

  @PostMapping("simpan")
  public String simpan(@RequestParam("file") MultipartFile file, Model model, SiswaDto siswaDto) {
    siswaService.simpanSiswa(siswaDto, file);
    return "redirect:/siswa";
  }

  @GetMapping("hapus/{id}")
  public String hapus(@PathVariable("id") Integer id) {
    siswaService.hapusSiswa(id);
    return "redirect:/siswa";
  }
}
