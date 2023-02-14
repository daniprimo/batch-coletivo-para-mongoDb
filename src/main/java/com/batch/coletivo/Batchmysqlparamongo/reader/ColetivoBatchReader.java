package com.batch.coletivo.Batchmysqlparamongo.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.batch.coletivo.Batchmysqlparamongo.dto.Ids;

@Configuration
public class ColetivoBatchReader {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public JdbcCursorItemReader<Ids> lerIdsDoColetivo (
			@Qualifier("dataReadColetivo") DataSource dataSource ) {
		return new JdbcCursorItemReaderBuilder()
				.name("lerIdsDoColetivo")
				.dataSource(dataSource)
				.sql("SELECT id, garagem_id FROM cco.tb_coletivo;")
				.rowMapper(new BeanPropertyRowMapper<Ids>(Ids.class))
				.fetchSize(0)
				.verifyCursorPosition(false)
				.saveState(false)
				.build();
	}

}
