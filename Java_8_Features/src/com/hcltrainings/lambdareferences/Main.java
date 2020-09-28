package com.hcltrainings.lambdareferences;

public class Main {
	public static void main(String[] args) {
		MethodReferenceDemo mrd = new MethodReferenceDemo();
		FunctionalInterface fi1 =mrd::display;
		FunctionalInterface fi2 = MethodReferenceDemo::show;
		fi1.methodReference();
		fi2.methodReference();
		ConstructionReference cr = MethodReferenceDemo::new;
		MethodReferenceDemo mrd2 = cr.constructorReference("Somethong", 23);
		System.out.println(mrd2.toString());
	}
}
