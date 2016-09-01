package com.robbins.paul.utils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public final class JavaUtils {

	private JavaUtils() {
		throw new IllegalAccessError("Utility Class");
	}

	/*
	 * Gets an ArrayList of all numbers within a range, inclusive
	 * @param low int representing the low end of the range,inclusive
	 * @param high int representing the high end of the range,inclusive
	 * @return a list of Integers between low and high, inclusive
	 */
	public static List<Integer> getRangeAsList(int low, int high) {
		return IntStream.rangeClosed(low, high).boxed().collect(Collectors.toList());
	}

	/*
	 * Finds the sum of all numbers in a list of Integers
	 * @param nums A list of integers to be totaled
	 * @return the total of all integers in list nums
	 */
	public static int total(List<Integer> nums) {
		return nums.stream().mapToInt(Integer::intValue).sum();
	}

	/*
	 * Finds the sum of all numbers in an list of Doubles
	 * @param nums A list of integers to be totaled
	 * @return the total of all integers in list nums
	 */
	public static double totalDoubles(List<Double> nums) {
		return nums.stream().mapToDouble(Double::doubleValue).sum();
	}

	/*
	 * Finds the sum of all numbers in an array of ints
	 * @param nums an array of integers to be totaled
	 * @return the total of all integers in array nums
	 */
	public static int total(int[] nums) {
		return IntStream.of(nums).sum();
	}

	/*
	 * Finds the sum of all numbers in an array of doubles
	 * @param nums an array of doubles to be totaled
	 * @return the total of all doubles in array nums
	 */
	public static double total(double[] nums) {
		return DoubleStream.of(nums).sum();
	}

	/*
	 * Converts an array of ints to an ArrayList
	 * @param nums an array of integers to be converted to a list
	 * @return an ArrayList of the Integers in array nums
	 */
	public static List<Integer> arrayToList(int[] nums) {
		return Arrays.stream(nums).boxed().collect(Collectors.toList());

	}

	/*
	 * Converts an array of doubles to an ArrayList
	 * @param nums an array of doubles to be converted to a list
	 * @return an ArrayList of the Doubles in array nums
	 */
	public static List<Double> arrayToList(double[] nums) {
		return Arrays.stream(nums).boxed().collect(Collectors.toList());

	}

	/*
	 * Gets all multiples of any amount of numbers from within a list
	 * @param ints a List of Integers to find multiples from
	 * @param ...mults any number of multiples to be found
	 * @return all multiples of ...mults in the List ints
	 */
	public static List<Integer> getMultiplesInList(List<Integer> ints, int... mults) {

		return ints.stream().filter(n -> IntStream.of(mults).anyMatch(k -> n % k == 0)).collect(Collectors.toList());
	}

	/*
	 * Converts a list of ints to an array
	 * @param nums a List of Integers to be converted to an array
	 * @return an array of the ints in List nums
	 */
	public static int[] intListToArray(List<Integer> nums) {
		int[] ints = new int[nums.size()];
		Iterator<Integer> iterator = nums.iterator();
		for(int i = 0; i < nums.size(); i++) {
			ints[i] = iterator.next().intValue();
		}
		
		return ints;
	}

	/*
	 * Converts a list of doubles to an array
	 * @param nums a List of Doubles to be converted to an array
	 * @return an array of the doubles in List nums
	 */
	public static double[] doubleListToArray(List<Double> nums) {
		double[] doubles = new double[nums.size()];
		Iterator<Double> iterator = nums.iterator();
		for(int i = 0; i < nums.size(); i++) {
			doubles[i] = iterator.next().doubleValue();
		}
		
		return doubles;
	}
	
	/*
	 * Retrieves all of the even numbers from an array
	 * @param nums an array of integers to extract evens from
	 * @return an array of integers containing all even ints in nums
	 */
	public static int[] getEvensFromArray(int[] nums) {
		return Arrays.stream(nums).filter(n -> n%2 == 0).toArray();
	}

	/*
	 * Retrieves all of the even numbers from an array
	 * @param nums an array of doubles to extract evens from
	 * @return an array of doubles containing all even doubles in nums
	 */
	public static double[] getEvensFromArray(double[] nums) {
		return Arrays.stream(nums).filter(n -> Math.abs(n%2) <= 0.000000001).toArray();
	}

	/*
	 * Retrieves all of the odd numbers from an array
	 * @param nums an array of integers to extract odds from
	 * @return an array of integers containing all odd ints in nums
	 */
	public static int[] getOddsFromArray(int[] nums) {
		return Arrays.stream(nums).filter(n -> n%2 != 0).toArray();
	}

	/*
	 * Retrieves all of the odd numbers from an array
	 * @param nums an array of doubles to extract odds from
	 * @return an array of doubles containing all odd doubles in nums
	 */
	public static double[] getOddsFromArray(double[] nums) {
		return Arrays.stream(nums).filter(n -> Math.abs(n%2) > 0).toArray();
	}
	
	/*
	 * Finds the largest prime factor of a number
	 * @param num the number of which to find the largest prime factor
	 * @return the largest prime factor of num
	 */
	public static int largestPrimeFactor(long num) {
		int i;
		for(i = 2; i <= num; i++) {
			if(num % i == 0) {
				num /= i;
				i--;
			}
		}
		return i;
	}
	
	/*
	 * A python like list comprehension
	 * @param list the list on which the function will be applied
	 * @param f the function to be applied to each member of the list
	 */
	public static <T> void applyToListInPlace(List<T> list, Function<T, T> f) {
	    ListIterator<T> itr = list.listIterator();
	    while (itr.hasNext()) {
	        T output = f.apply(itr.next());
	        itr.set(output);
	    }
	}
}
