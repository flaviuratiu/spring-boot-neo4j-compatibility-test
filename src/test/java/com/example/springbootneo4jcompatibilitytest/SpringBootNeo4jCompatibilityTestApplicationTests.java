package com.example.springbootneo4jcompatibilitytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.neo4j.core.Neo4jClient;

@SpringBootTest
class SpringBootNeo4jCompatibilityTestApplicationTests {

	@Autowired
	private Neo4jClient neo4jClient;

	@Test
	void testNeo4jConnection_whenQueryIsRun_thenNoExceptionShouldBeThrown() {
		neo4jClient.query("MATCH (n) RETURN n")
				.run();
	}

}
