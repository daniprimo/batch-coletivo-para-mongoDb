package com.batch.coletivo.Batchmysqlparamongo.writer;

import org.springframework.batch.item.data.MongoItemWriter;
import org.springframework.batch.item.data.builder.MongoItemWriterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.batch.coletivo.Batchmysqlparamongo.dto.Coletivo;

@Configuration
public class ColetivoBatchWriters {
	
	@Bean
	public MongoItemWriter<Coletivo> jdbccursoWrtiter (MongoTemplate mongoTemplate) {
		return new MongoItemWriterBuilder<Coletivo>()
				.template(mongoTemplate)
				.collection("ColetivoResponse")
				.build();
	}
	
}
