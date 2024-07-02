package dev.ryuuwiz.project_uas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class WebController {
  @GetMapping
  public String Home(HttpSession session) {
    session.setAttribute("url", "home");
    return "index";
  }

  @GetMapping("siswa")
  public String Siswa(HttpSession session) {
    session.setAttribute("url", "siswa");
    return "";
  }

  @GetMapping("mapel")
  public String MataPelajaran(HttpSession session) {
    session.setAttribute("url", "mapel");
    return "";
  }

  @GetMapping("silabus")
  public String Silabus(HttpSession session) {
    session.setAttribute("url", "silabus");
    return "";
  }

  @GetMapping("bahanAjar")
  public String BahanAjar(HttpSession session) {
    session.setAttribute("url", "bahanAjar");
    return "";
  }

}
