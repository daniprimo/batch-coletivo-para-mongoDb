package com.batch.coletivo.Batchmysqlparamongo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.batch.coletivo.Batchmysqlparamongo.dto.Coletivo;
import com.batch.coletivo.Batchmysqlparamongo.dto.Ids;
import com.batch.coletivo.Batchmysqlparamongo.repository.RepositoryJDBC;

@Component
public class ColetivoServiceJDBC implements RepositoryJDBC {
	
	@Autowired
	private Connection connection;

	@Override
	public Coletivo construirColetivo (Ids ids) {
		String sql = 
				"SELECT c.id, c.prefixo, c.modelo , c.status, g.nome, g.cidade"
				+ " FROM cco.tb_coletivo as c"
				+ " inner join cco.tb_garagem as g"
				+ " on g.id = c.garagem_id where c.id = "+ids.getId() +";";
		
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
			preparedStatement.execute();
			
			try (ResultSet resultSet = preparedStatement.getResultSet()){
				while (resultSet.next()) {
					return new Coletivo(resultSet.getLong(1),
							resultSet.getString(2),
							resultSet.getString(3),
							resultSet.getString(4),
							resultSet.getString(5),
							resultSet.getString(6));
				}
			}
		} catch (Exception e) {
			System.out.println("Falha na conexão do jdbc");
			e.printStackTrace();
		}
		
		return null;
		
	}


}
