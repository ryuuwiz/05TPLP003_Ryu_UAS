package dev.ryuuwiz._TPLP003_Ryu_UAS.service;

import java.io.IOException;
import java.util.List;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dev.ryuuwiz._TPLP003_Ryu_UAS.model.ImageInfo;
import dev.ryuuwiz._TPLP003_Ryu_UAS.repository.ImageInfoRepo;

@Service
public class FileStorageService {
  @Autowired
  private ImageInfoRepo imageInfoRepo;

  public ImageInfo saveImage(MultipartFile file) throws IOException {
    ImageInfo imageInfo = new ImageInfo();
    imageInfo.setData(Base64.getEncoder().encodeToString(file.getBytes()));
    return imageInfoRepo.save(imageInfo);
  }

  public List<ImageInfo> getListImages() {
    return imageInfoRepo.findAll();
  }

  public ImageInfo getImage(Long id) {
    return imageInfoRepo.findById(id).orElse(null);
  }
}
