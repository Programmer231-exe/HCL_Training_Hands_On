package com.hcltrainings.collectionsdemo.calllogdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogFactory {
	public static List<CallLog> calllogGenerator() {
		String calldetails;
		String[] splittedDetails;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		BufferedReader br;
		List<CallLog> callLogList = new ArrayList<CallLog>();
		try {
			br = new BufferedReader(new FileReader("/Eclipse/Java/ComparableDemo/src/weekly.csv"));
			calldetails = br.readLine();
			while (calldetails != null) {
				splittedDetails = calldetails.split(",");
				LocalDate date = LocalDate.parse(splittedDetails[3], formatter);
				callLogList.add(new CallLog(splittedDetails[0], splittedDetails[1],
						Integer.parseInt(splittedDetails[2]), date));
				calldetails = br.readLine();

			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("File NOt Found");
		} catch (IOException ioe) {
			System.err.println("Error ocuurs");
		}

		return callLogList;

	}
	
	public static List<SummaryLog> summaryLogGenerator(List<CallLog> callLogList){
		Iterator<CallLog> iterator = callLogList.iterator();
		List<SummaryLog> summaryLogList = new ArrayList<SummaryLog>();
		while(iterator.hasNext()) {
			CallLog callLog = (CallLog)iterator.next();
			summaryLogList.add(new SummaryLog(callLog.getName(),callLog.getDialledNumber(),callLog.getDuration()));
			
		}
		
		return summaryLogList;
		
		
	}
}
