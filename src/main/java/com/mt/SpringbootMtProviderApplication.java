package com.mt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.mt.mapper")
@ImportResource( value = {"classpath:dubbo-provider.xml"} )
public class SpringbootMtProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMtProviderApplication.class, args);
	}
}
