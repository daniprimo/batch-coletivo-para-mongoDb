package com.batch.coletivo.Batchmysqlparamongo.job;

import javax.sql.DataSource;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@EnableBatchProcessing
public class JobConfig {

	@Autowired
	private JobBuilderFactory builderFactory;

	@Autowired
	@Qualifier("metaDadosBd")
	private JdbcTemplate jdbcTemplate;
	
	@Bean
	public Job job(Step step) {
		return builderFactory.get("job").start(step).listener(excluirMetadados()).build();
	}

	
	@Bean
	public JobExecutionListener excluirMetadados() {
		JobExecutionListener executionListener = new JobExecutionListener() {

			@Override
			public void beforeJob(JobExecution jobExecution) {
				System.out.println("Antes do job");
				System.out.println(jobExecution.getStatus().toString());

			}

			@Override
			public void afterJob(JobExecution jobExecution) {
				System.out.println("Depois do job");
				System.out.println(jobExecution.getStatus().toString());
		
				if (jobExecution.getStatus() == BatchStatus.COMPLETED) {

//					jdbcTemplate.batchUpdate("DROP DATABASE batch_metadados_coletivo;");
				
				
				}

			}
		};

		return executionListener;
	}

}
