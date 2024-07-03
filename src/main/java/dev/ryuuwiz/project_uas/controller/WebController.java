package dev.ryuuwiz.project_uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.ryuuwiz.project_uas.service.BahanAjarService;
import dev.ryuuwiz.project_uas.service.MataPelajaranService;
import dev.ryuuwiz.project_uas.service.SilabusService;
import dev.ryuuwiz.project_uas.service.SiswaService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class WebController {

  @Autowired
  private SiswaService siswaService;

  @Autowired
  private MataPelajaranService mataPelajaranService;

  @Autowired
  private SilabusService silabusService;

  @Autowired
  private BahanAjarService bahanAjarService;

  @GetMapping
  public String Home(HttpSession session) {
    session.setAttribute("url", "home");
    return "index";
  }

  @GetMapping("siswa")
  public String Siswa(HttpSession session, Model model) {
    model.addAttribute("allSiswa", siswaService.lihatSiswa());
    session.setAttribute("url", "siswa");
    return "siswa";
  }

  @GetMapping("siswa/simpan")
  public String TambahSiswa(HttpSession session) {
    session.setAttribute("url", "siswa");
    return "tambah-siswa";
  }

  @GetMapping("mapel")
  public String MataPelajaran(HttpSession session, Model model) {
    session.setAttribute("url", "mapel");
    model.addAttribute("allMapel", mataPelajaranService.lihatMapel());
    return "matapelajaran";
  }

  @GetMapping("mapel/simpan")
  public String TambahMapel(HttpSession session) {
    session.setAttribute("url", "mapel");
    return "tambah-mapel";
  }

  @GetMapping("silabus")
  public String Silabus(HttpSession session, Model model) {
    session.setAttribute("url", "silabus");
    model.addAttribute("allSilabus", silabusService.lihatSilabus());
    return "silabus";
  }

  @GetMapping("silabus/simpan")
  public String TambahSilabus(HttpSession session, Model model) {
    session.setAttribute("url", "silabus");
    model.addAttribute("allMapel", mataPelajaranService.lihatMapel());
    return "tambah-silabus";
  }

  @GetMapping("bahanAjar")
  public String BahanAjar(HttpSession session, Model model) {
    session.setAttribute("url", "bahanAjar");
    model.addAttribute("allAjar", bahanAjarService.lihatAjar());
    return "bahanAjar";
  }

  @GetMapping("bahanAjar/simpan")
  public String TambahBahanAjar(HttpSession session, Model model) {
    session.setAttribute("url", "bahanAjar");
    model.addAttribute("allMapel", mataPelajaranService.lihatMapel());
    return "tambah-ajar";
  }

}
