package com.batch.coletivo.Batchmysqlparamongo.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.batch.coletivo.Batchmysqlparamongo.dto.Coletivo;
import com.batch.coletivo.Batchmysqlparamongo.dto.Ids;

@Configuration
public class StepConfig {

	@Autowired
	private StepBuilderFactory builderFactory;
	
	@Bean
	public Step step (
			ItemReader<Ids> reader,
			ItemProcessor<Ids, Coletivo> processor,
			ItemWriter<Coletivo> write) {
		return builderFactory
				.get("step")
				.<Ids, Coletivo>chunk(3)
				.reader(reader)
				.processor(processor)
				.writer(write)
				.build();
	}
	
	
	
}
