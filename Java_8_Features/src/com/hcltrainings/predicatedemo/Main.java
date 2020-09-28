package com.hcltrainings.predicatedemo;

import java.util.function.*;
public class Main {
	public static void main(String[] args) {
		int[] x = {0,5,10,15,20,25,30};
		Predicate<Integer> pInt1 = i -> i>10;
		Predicate<Integer> pInt2 = i -> i%2 == 0;
		System.out.println("The Numbers Greater than 10:");
		m1(pInt1,x);
		System.out.println("The Even Numbers are ");
		m1(pInt2,x);
		System.out.println("The NUmber not greater than 10");
		m1(pInt1.negate(),x);
		System.out.println("The Numbe Greater than 10 or even");
		m1(pInt1.or(pInt2),x);
		System.out.println("The Number greare than 10 as well as even");
		m1(pInt1.and(pInt2),x);
		
	}
	
	public static void m1(Predicate<Integer> p , int[] x) {
		for(int x1 : x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
}
