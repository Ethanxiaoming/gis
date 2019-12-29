package com.nankai.gis;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.nankai.gis.mapper")
@ServletComponentScan
public class GisApplication {

	public static void main(String[] args) {
		SpringApplication.run(GisApplication.class, args);
	}

}
