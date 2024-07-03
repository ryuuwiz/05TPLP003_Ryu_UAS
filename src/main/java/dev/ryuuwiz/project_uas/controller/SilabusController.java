package dev.ryuuwiz.project_uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.ryuuwiz.project_uas.dto.SilabusForm;
import dev.ryuuwiz.project_uas.service.SilabusService;

@Controller
@RequestMapping("silabus")
public class SilabusController {

  @Autowired
  private SilabusService silabusService;

  @PostMapping("simpan")
  public String simpan(SilabusForm silabusForm) {
    silabusService.simpanSilabus(silabusForm);
    return "redirect:/silabus";
  }

  @GetMapping("hapus/{id}")
  public String hapus(@PathVariable("id") Integer id) {
    silabusService.hapusSilabus(id);
    return "redirect:/silabus";
  }
}
