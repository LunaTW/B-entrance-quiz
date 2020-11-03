package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}

// TODO GTB-知识点: * 没有理解和掌握@RestController和ResponseEntity的用法
// TODO GTB-完成度: * 大部分功能没有完成，完成的部分存在bug
// TODO GTB-测试: * 没有包含任何测试
// TODO GTB-工程实践: * 项目分包合理，使用了三层架构