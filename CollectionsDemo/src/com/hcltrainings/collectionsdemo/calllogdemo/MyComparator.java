package com.hcltrainings.collectionsdemo.calllogdemo;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{
	@Override
	public int compare(Object obj1,Object obj2) {
		SummaryLog slog1 = (SummaryLog)obj1;
		SummaryLog slog2 = (SummaryLog)obj2;
		return slog2.getName().compareTo(slog1.getName());
	}
}
