package com.robbins.paul.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JavaUtilsTests {

	@Test
	public void testGetRangeAsList() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);

		List<Integer> actual = JavaUtils.getRangeAsList(1, 10);
		assertTrue(expected.equals(actual));
	}

	@Test
	public void testTotalList() {

		int expectedSum = 15;
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		assertEquals(expectedSum, JavaUtils.total(list));
	}
	
	@Test
	public void testTotalArray() {
		int expectedSum = 15;
		int[] ints = new int[]{1,2,3,4,5};
		
		assertEquals(expectedSum, JavaUtils.total(ints));
	}
}
