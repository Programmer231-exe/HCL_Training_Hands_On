package com.hcltrainings.collectionsdemo.calllogdemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
		public static void main(String[] args) {
			List<CallLog> callLogList = LogFactory.calllogGenerator();
			List<SummaryLog> summaryLogList = LogFactory.summaryLogGenerator(callLogList);
			Collections.sort(summaryLogList,new MyComparator());
			System.out.format("\n%-10s %-20s %-20s","Caller Name","","Duration");
			Iterator<SummaryLog> iterator = summaryLogList.iterator();
			while(iterator.hasNext()) {
				SummaryLog summaryLog = (SummaryLog)iterator.next();
				summaryLog.display();
			}
		}
}
