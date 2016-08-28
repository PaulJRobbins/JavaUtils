package com.robbins.paul.utils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public final class JavaUtils {

	private JavaUtils() {
		throw new IllegalAccessError("Utility Class");
	}

	public static List<Integer> getRangeAsList(int low, int high) {
		return IntStream.rangeClosed(low, high).boxed().collect(Collectors.toList());
	}

	public static int total(List<Integer> nums) {
		return nums.stream().mapToInt(Integer::intValue).sum();
	}

	public static int total(int[] nums) {
		return IntStream.of(nums).sum();
	}

	public static long total(long[] nums) {
		return LongStream.of(nums).sum();
	}

	public static double total(double[] nums) {
		return DoubleStream.of(nums).sum();
	}


	public static List<Integer> arrayToList(int[] nums) {
		return Arrays.stream(nums).boxed().collect(Collectors.toList());

	}

	public static List<Double> arrayToList(double[] nums) {
		return Arrays.stream(nums).boxed().collect(Collectors.toList());

	}

	public static List<Integer> getMultiplesInList(List<Integer> ints, int... mults) {

		return ints.stream().filter(n -> IntStream.of(mults).anyMatch(k -> n % k == 0)).collect(Collectors.toList());
	}

	public static int[] intListToArray(List<Integer> nums) {
		int[] ints = new int[nums.size()];
		Iterator<Integer> iterator = nums.iterator();
		for(int i = 0; i < nums.size(); i++) {
			ints[i] = iterator.next().intValue();
		}
		
		return ints;
	}

	public static double[] doubleListToArray(List<Double> nums) {
		double[] doubles = new double[nums.size()];
		Iterator<Double> iterator = nums.iterator();
		for(int i = 0; i < nums.size(); i++) {
			doubles[i] = iterator.next().doubleValue();
		}
		
		return doubles;
	}

	public static long[] longListToArray(List<Long> nums) {
		long[] longs = new long[nums.size()];
		Iterator<Long> iterator = nums.iterator();
		for(int i = 0; i < nums.size(); i++) {
			longs[i] = iterator.next().longValue();
		}
		
		return longs;
	}

	public static short[] shortListToArray(List<Short> nums) {
		short[] shorts = new short[nums.size()];
		Iterator<Short> iterator = nums.iterator();
		for(int i = 0; i < nums.size(); i++) {
			shorts[i] = iterator.next().shortValue();
		}
		
		return shorts;
	}
	
	public static int[] getEvensFromArray(int[] nums) {
		return Arrays.stream(nums).filter(n -> n%2 == 0).toArray();
	}

	public static long[] getEvensFromArray(long[] nums) {
		return Arrays.stream(nums).filter(n -> n%2 == 0).toArray();
	}

	public static double[] getEvensFromArray(double[] nums) {
		return Arrays.stream(nums).filter(n -> Math.abs(n%2) <= 0.000000001).toArray();
	}

	public static int[] getOddsFromArray(int[] nums) {
		return Arrays.stream(nums).filter(n -> n%2 != 0).toArray();
	}

	public static long[] getOddsFromArray(long[] nums) {
		return Arrays.stream(nums).filter(n -> n%2 != 0).toArray();
	}

	public static double[] getOddsFromArray(double[] nums) {
		return Arrays.stream(nums).filter(n -> Math.abs(n%2) > 0).toArray();
	}
}
