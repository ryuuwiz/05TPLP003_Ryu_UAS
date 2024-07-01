package dev.ryuuwiz._TPLP003_Ryu_UAS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.ryuuwiz._TPLP003_Ryu_UAS.model.ImageInfo;

@Repository
public interface ImageInfoRepo extends JpaRepository<ImageInfo, Long> {

}
