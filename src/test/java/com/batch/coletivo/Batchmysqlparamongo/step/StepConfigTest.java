package com.batch.coletivo.Batchmysqlparamongo.step;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(MockitoJUnitRunner.class)
class StepConfigTest {
	
	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
//		JobExecution step = jobLauncherTestUtils.launchStep("step");
//
//		StepExecution stepExecution = step.getStepExecutions().iterator().next();
		
	}

}
