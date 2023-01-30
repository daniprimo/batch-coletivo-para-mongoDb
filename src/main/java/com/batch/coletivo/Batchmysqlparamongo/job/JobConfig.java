package com.batch.coletivo.Batchmysqlparamongo.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class JobConfig {

	@Autowired
	private JobBuilderFactory builderFactory;
	
	@Bean
	public Job job(Step step) {
		return builderFactory
				.get("job")
				.start(step)
				.incrementer(new RunIdIncrementer())
				.build();
	}
	
}
