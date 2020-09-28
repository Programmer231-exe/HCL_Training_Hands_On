package com.hcltrainings.lambdaexpressiondemo.case1;

public class Main {
	public static void main(String[] args) {
		Summing<Integer> it = (n) -> {
			for(int i = 0; i < 10 ; i++) {
				n = n+ i;
			}
				return n;
		};
		
		Summing<Double> d = (n) -> {
			for(int i = 0; i < 10 ; i++) {
				n = n+ i + 1.0;
			}
				return n;
		};
		
		System.out.println(it.summingFunc(2));
		System.out.println(d.summingFunc(2.0));
		System.out.println("******************");
		
		StringFunc sf = (str) ->{
			String s1 ="";
			for(int i = str.length() - 1; i >=0 ; i--) {
				s1 = s1 + str.charAt(i);
			}
			return s1;
		};
		
		System.out.println(sf.func("Sivasankar"));
		
	}
}
