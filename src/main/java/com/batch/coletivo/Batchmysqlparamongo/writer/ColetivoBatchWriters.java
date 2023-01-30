package com.batch.coletivo.Batchmysqlparamongo.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.batch.coletivo.Batchmysqlparamongo.dto.Ids;

@Configuration
public class ColetivoBatchWriters {
	
	@Bean
	public ItemWriter<Ids> jdbccursoWrtiter () {
		return clientes -> clientes.forEach(System.out::println);
	}
	
}
