package com.batch.coletivo.Batchmysqlparamongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class BatchMysqlParaMongoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(BatchMysqlParaMongoApplication.class, args);
		context.close();
		log.info("Start do batch ...............");
	}

}
