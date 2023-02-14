package com.batch.coletivo.Batchmysqlparamongo.writer;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.batch.item.data.MongoItemWriter;
import org.springframework.batch.item.data.builder.MongoItemWriterBuilder;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.batch.coletivo.Batchmysqlparamongo.dto.Coletivo;

@SpringBatchTest
@SpringBootTest
class ColetivoBatchWritersTest {

	@Mock
	private MongoItemWriterBuilder<Coletivo> builder;

	@Mock
	private MongoItemWriter<Coletivo> writer;

	@Mock
	private MongoTemplate mongoTemplate;

	@InjectMocks
	private ColetivoBatchWriters coletivoBatchWriters;

	private static final String COLLECTION = "ColetivoResponse";

	@BeforeEach
	public void setUp(){
		when(builder.template(mongoTemplate)).thenReturn(builder);
		when(builder.collection(COLLECTION)).thenReturn(builder);
		when(builder.build()).thenReturn(writer);
	}

//	@Test
//	public void writer_SUCESSO() {
//		ReflectionTestUtils.setField(coletivoBatchWriters, "builder", builder);
//		var writer = coletivoBatchWriters.jdbccursoWrtiter(mongoTemplate);
//		assertEquals(this.writer, writer);
//	}

}
