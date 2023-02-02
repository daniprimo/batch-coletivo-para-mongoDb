package com.batch.coletivo.Batchmysqlparamongo.repository;

import org.springframework.stereotype.Repository;

import com.batch.coletivo.Batchmysqlparamongo.dto.Coletivo;
import com.batch.coletivo.Batchmysqlparamongo.dto.Ids;

@Repository
public interface RepositoryJDBC {

	public Coletivo construirColetivo(Ids ids);
	
}
