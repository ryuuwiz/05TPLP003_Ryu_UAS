package dev.ryuuwiz.project_uas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.ryuuwiz.project_uas.dto.MataPelajaranDto;
import dev.ryuuwiz.project_uas.service.MataPelajaranService;

@SpringBootApplication
public class ProjectUasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectUasApplication.class, args);
	}

	@Autowired
	private MataPelajaranService mataPelajaranService;

	@Bean
	public CommandLineRunner run() {
		MataPelajaranDto seedMapel1 = new MataPelajaranDto();
		seedMapel1.setKode_mapel("SAINS01");
		seedMapel1.setNama_mapel("IPA");
		seedMapel1.setTingkat("1");

		MataPelajaranDto seedMapel2 = new MataPelajaranDto();
		seedMapel2.setKode_mapel("SAINS02");
		seedMapel2.setNama_mapel("BIOLOGI");
		seedMapel2.setTingkat("2");

		return (args) -> {
			mataPelajaranService.simpanMapel(seedMapel1);
			mataPelajaranService.simpanMapel(seedMapel2);
		};
	}
}
