package com.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Part1 {

	public void getEvenNum() {
		List<Integer> asList = Arrays.asList(10,15,8,49,25,98,32);
		asList.stream().filter(num -> num %2 == 0).forEach(System.out::println);
	}
	
	public void startWithOne() {
		List<Integer> asList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		asList.stream().map(num -> num + " ").filter(num -> num.startsWith("1")).forEach(System.out::println);
	}
	
	public void findDuplicate() {
		List<Integer> asList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet<>();
		asList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	}
	
	public void findFirst() {
		List<Integer> asList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		asList.stream().findFirst().ifPresent(System.out::println);
	}
	
}
