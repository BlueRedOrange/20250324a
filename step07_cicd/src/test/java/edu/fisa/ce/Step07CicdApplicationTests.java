package edu.fisa.ce;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Step07CicdApplicationTests {

	@Test
	void contextLoads() {
		int result = 12 +3;
		System.out.println("**********비교전");
		assertEquals(15,result);
		System.out.println("**********비교후");
	}

}
