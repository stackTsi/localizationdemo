package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
@AutoConfigureMockMvc
class CalculatorServiceTests {

	@MockBean
	private CalculatorService calculatorService;

	private final CalculatorService calcService = new CalculatorService();

	@Test
	void testAdd() {
		assertEquals(5, calcService.add(2, 3));
	}

	@Test
	void testSubtract() {
		assertEquals(-1, calcService.subtract(2, 3));
	}

	@Test
	void testMultiply() {
		assertEquals(6, calcService.multiply(2, 3));
	}

	@Test
	void testDivide() {
		assertEquals(2, calcService.divide(6, 3));
	}

	@Test
	void testDivideByZero() {
		assertThrows(IllegalArgumentException.class, () -> calcService.divide(1, 0));
	}
	
}
