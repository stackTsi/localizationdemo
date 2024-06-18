package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorServiceTests {


	private final CalculatorService calcService = new CalculatorService();

	@Test
	public void testAdd() {
		assertEquals(5.0, calcService.add(2, 3),0.001);
	}

	@Test
	public void testSubtract() {
		assertEquals(-1.0, calcService.subtract(2, 3),0.001);
	}

	@Test
	public void testMultiply() {
		assertEquals(6.0, calcService.multiply(2, 3),0.001);
	}

	@Test
	public void testDivide() {
		assertEquals(2.0, calcService.divide(6, 3),0.001);
	}

	@Test
	public void testDivideByZero() {
		try {
			calcService.divide(1, 0);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
}

