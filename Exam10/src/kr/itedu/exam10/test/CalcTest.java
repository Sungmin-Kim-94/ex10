package kr.itedu.exam10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void testSum() {
		assertEquals(10, Calc.sum(0, 10));
		assertEquals(10, Calc.sum(1, 9));
		assertEquals(10, Calc.sum(2, 8));
		assertEquals(10, Calc.sum(3, 7));
		assertEquals(10, Calc.sum(4, 6));
		assertEquals(10, Calc.sum(5, 5));
		assertEquals(10, Calc.sum(6, 4));
		assertEquals(10, Calc.sum(7, 3));
		assertEquals(10, Calc.sum(8, 2));
		assertEquals(10, Calc.sum(9, 1));
		assertEquals(10, Calc.sum(10, 0));
	}

}
