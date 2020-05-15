package cn.xiaoyuluntaidian.springbootf13;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.xiaoyuluntaidian.springbootf13.dao")
public class Springbootf13Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootf13Application.class, args);
	}

}
