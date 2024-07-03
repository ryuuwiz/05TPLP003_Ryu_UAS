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

import dev.ryuuwiz.project_uas.dto.BahanAjarForm;
import dev.ryuuwiz.project_uas.service.BahanAjarService;

@Controller
@RequestMapping("bahanAjar")
public class BahanAjarController {

  @Autowired
  private BahanAjarService bahanAjarService;

  @PostMapping("simpan")
  public String simpan(@RequestParam("file") MultipartFile file, Model model, BahanAjarForm bahanAjarForm) {
    bahanAjarService.simpanAjar(bahanAjarForm, file);
    return "redirect:/bahanAjar";
  }

  @GetMapping("hapus/{id}")
  public String hapus(@PathVariable("id") Integer id) {
    bahanAjarService.hapusAjar(id);
    return "redirect:/bahanAjar";
  }
}
