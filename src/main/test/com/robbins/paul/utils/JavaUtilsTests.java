package com.robbins.paul.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
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
	public void testTotalIntArray() {
		int expectedSum = 15;
		int[] ints = new int[]{1,2,3,4,5};
		
		assertEquals(expectedSum, JavaUtils.total(ints));
	}

	@Test
	public void testTotalDoubleArray() {
		double expectedSum = 17.3;
		double[] doubles = new double[]{1.2,2.5,3.1,4.9,5.6};
		
		assertTrue(Math.abs(expectedSum - JavaUtils.total(doubles)) == 0);
	}
	
	@Test
	public void testIntArrayToList() {
		int[] ints = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
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
		
		assertTrue(expected.equals(JavaUtils.arrayToList(ints)));
	}

	@Test
	public void testDoubleArrayToList() {
		double[] doubles = new double[]{0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		List<Double> expected = new ArrayList<>();
		expected.add(0.0);
		expected.add(1.0);
		expected.add(2.0);
		expected.add(3.0);
		expected.add(4.0);
		expected.add(5.0);
		expected.add(6.0);
		expected.add(7.0);
		expected.add(8.0);
		expected.add(9.0);
		expected.add(10.0);
		
		assertTrue(expected.equals(JavaUtils.arrayToList(doubles)));
	}
	
	@Test
	public void testGetMultiplesInList() {
		List<Integer> ints = JavaUtils.getRangeAsList(1,99);
		List<Integer> expected = new ArrayList<>();
		expected.add(13);
		expected.add(24);
		expected.add(26);
		expected.add(39);
		expected.add(48);
		expected.add(52);
		expected.add(65);
		expected.add(72);
		expected.add(78);
		expected.add(91);
		expected.add(96);

		assertTrue(expected.equals(JavaUtils.getMultiplesInList(ints, 13, 24)));
	}
	
	@Test
	public void testIntListToArray() {
		List<Integer> ints = new ArrayList<>();
		ints.add(0);
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		ints.add(5);
		ints.add(6);
		ints.add(7);
		ints.add(8);
		ints.add(9);
		ints.add(10);
		
		int[] expected = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		
		assertTrue(Arrays.equals(expected, JavaUtils.intListToArray(ints)));
	}

	@Test
	public void testDoubleListToArray() {
		List<Double> ints = new ArrayList<>();
		ints.add(0.0);
		ints.add(1.0);
		ints.add(2.0);
		ints.add(3.0);
		ints.add(4.0);
		ints.add(5.0);
		ints.add(6.0);
		ints.add(7.0);
		ints.add(8.0);
		ints.add(9.0);
		ints.add(10.0);
		
		double[] expected = new double[]{0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		
		assertTrue(Arrays.equals(expected, JavaUtils.doubleListToArray(ints)));
	}
	
	@Test
	public void testIntGetEvensFromArray() {
		int[] ints = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		int[] expected = new int[]{0,2,4,6,8,10};
		
		assertTrue(Arrays.equals(expected, JavaUtils.getEvensFromArray(ints)));
	}

	@Test
	public void testDoubleGetEvensFromArray() {
		double[] doubles = new double[]{0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		double[] expected = new double[]{0.0,2.0,4.0,6.0,8.0,10.0};
		
		assertTrue(Arrays.equals(expected, JavaUtils.getEvensFromArray(doubles)));
	}
	
	@Test
	public void testIntGetOddsFromArray() {
		int[] ints = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		int[] expected = new int[]{1,3,5,7,9};
		
		assertTrue(Arrays.equals(expected, JavaUtils.getOddsFromArray(ints)));
	}

	@Test
	public void testDoubleGetOddsFromArray() {
		double[] doubles = new double[]{0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		double[] expected = new double[]{1.0,3.0,5.0,7.0,9.0};
		
		assertTrue(Arrays.equals(expected, JavaUtils.getOddsFromArray(doubles)));
	}
}
