package com.robbins.paul.examples;

import java.util.ArrayList;
import java.util.List;

import com.robbins.paul.utils.Func;
import com.robbins.paul.utils.JavaUtils;

public class ListComprehension {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Red");
		l.add("Blue");
		l.add("Yellow");
		l.add("Green");
		l.add("Purple");
		l.add("Orange");
		
		JavaUtils.applyToListInPlace(l, new Func<String, String>() {
			
			public String apply(String in) {
				return new StringBuilder(in).reverse().toString();
			}
		});
		
		System.out.println(l);
	}
	
}
