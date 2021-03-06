package cn.cm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

/**
 * Created by 北大课工场
 */
@SpringBootApplication
@EnableZipkinStreamServer
public class DmZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmZipkinServerApplication.class, args);
	}
}
