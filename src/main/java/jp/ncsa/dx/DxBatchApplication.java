package jp.ncsa.dx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DxBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxBatchApplication.class, args);
	}

}
