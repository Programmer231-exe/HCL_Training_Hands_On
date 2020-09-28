
package com.hcltrainings.lambdawithcollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		System.out.println("Before Starting : " + list);
		Collections.sort(list,(l1,l2) -> (l1 < l2)?1:(l2 < l1)?-1:0);
		System.out.println("After Starting :  " + list);
	}
}
