package com.batch.coletivo.Batchmysqlparamongo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Document(collection = "ColetivoResponse")
public class Coletivo {

	@Id
	private Long id;
	private String prefixo;
	private String modelo;
	private String status;
	private String nome;
	private String cidade;

}
