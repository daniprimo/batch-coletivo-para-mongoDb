package com.batch.coletivo.Batchmysqlparamongo.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.batch.coletivo.Batchmysqlparamongo.dto.Coletivo;
import com.batch.coletivo.Batchmysqlparamongo.dto.Ids;
import com.batch.coletivo.Batchmysqlparamongo.repository.RepositoryJDBC;

@Configuration
public class ProcessorConfig implements ItemProcessor<Ids, Coletivo> {

	@Autowired
	private RepositoryJDBC jdbc;
	
	@Override
	public Coletivo process(Ids item) throws Exception {
		Coletivo coletivo = jdbc.construirColetivo(item);
		return coletivo;

	}

}
