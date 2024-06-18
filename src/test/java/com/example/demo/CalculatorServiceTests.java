package com.example.demo;


import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorServiceTests {

	@MockBean
	private CalculatorService calculatorService;

	private final CalculatorService calcService = new CalculatorService();

	@Test
	public void testAdd() {
		assertEquals(5, calcService.add(2, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(-1, calcService.subtract(2, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(6, calcService.multiply(2, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(2, calcService.divide(6, 3));
	}

	@Test
	public void testDivideByZero() {
		assertThrows(IllegalArgumentException.class, () -> calcService.divide(1, 0));
	}
	
}
