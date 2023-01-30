package com.batch.coletivo.Batchmysqlparamongo.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.batch.coletivo.Batchmysqlparamongo.dto.Ids;

@Configuration
public class StepConfig {

	@Autowired
	private StepBuilderFactory builderFactory;
	
	@Bean
	public Step step (ItemReader<Ids> reader, ItemWriter<Ids> write) {
		return builderFactory
				.get("step")
				.<Ids, Ids>chunk(3)
				.reader(reader)
				.writer(write)
				.build();
	}
	
	
	
}
