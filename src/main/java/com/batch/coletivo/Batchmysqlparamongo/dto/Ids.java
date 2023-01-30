package com.batch.coletivo.Batchmysqlparamongo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ids {
	
	private Long id;
	private Long garagem_id;
	
	@Override
	public String toString() {
		return "Coletivo [id=" + id + ", garagem_id=" + garagem_id + "] (APRESENTACAO SOMENTE A LEITURA DESENVOLVIDA)";
	}


}
