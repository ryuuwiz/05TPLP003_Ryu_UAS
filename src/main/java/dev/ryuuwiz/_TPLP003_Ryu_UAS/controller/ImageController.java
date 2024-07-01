package dev.ryuuwiz._TPLP003_Ryu_UAS.controller;

import java.io.IOException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import dev.ryuuwiz._TPLP003_Ryu_UAS.model.ImageInfo;
import dev.ryuuwiz._TPLP003_Ryu_UAS.service.FileStorageService;

@Controller
public class ImageController {
  @Autowired
  private FileStorageService fileStorageService;

  @GetMapping("/")
  public String Homepage(Model model) {
    // Map<Long, String> productBase64Images = new HashMap<>();
    // for (ImageInfo image : fileStorageService.getListImages()) {
    //   productBase64Images.put(image.getId(), Base64.getEncoder().encodeToString(image.getData()));
    // }

    List<ImageInfo> listImages = fileStorageService.getListImages();

    model.addAttribute("images", listImages);
    return "index";
  }

  @PostMapping("/images")
  public String uploadImage(@RequestParam("file") MultipartFile file, Model model) throws IOException {
    fileStorageService.saveImage(file);
    model.addAttribute("message", "Image upload success!");
    return "redirect:/";
  }

}
