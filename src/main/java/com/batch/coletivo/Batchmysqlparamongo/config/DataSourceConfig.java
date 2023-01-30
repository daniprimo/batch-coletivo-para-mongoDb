package com.batch.coletivo.Batchmysqlparamongo.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {

	@Primary
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource metaDadosBd () {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	@ConfigurationProperties(prefix = "app.datasource")
	public DataSource dataReadColetivo () {
		return DataSourceBuilder.create().build();
	}
	
}
