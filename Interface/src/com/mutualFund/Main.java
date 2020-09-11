package com.mutualFund;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		mutualFundManager();
	}

	private static void mutualFundManager() {
		double amount;
		int duration;
		String[] mutualFundBanks = { "AxisBank", "HDFC", "ICICI" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter the Amount you want to invest: ");
			amount = Double.parseDouble(br.readLine());
			System.out.println("Enter the tenure of the SIP");
			duration = Integer.parseInt(br.readLine());
			for (int i = 0; i < 3; i++) {
				mutualFundManager(mutualFundBanks[i], amount, duration);
			}
		} catch (IOException ioe) {
			System.out.println("Error in Inputs");
		}

	}

	private static void mutualFundManager(String name, double amount, int duration) {
		MutualFund mf = null;
		if (name.equals("AxisBank")) {
			System.out.println("\n" + name + ":-");
			mf = new AxisBank(amount, duration);
			mf.amount();
			mf.duration();
		} else if (name.equals("ICICI")) {
			System.out.println("\n" + name + ":-");
			mf = new ICICI(amount, duration);
			mf.amount();
			mf.duration();
		} else if (name.equals("HDFC")) {
			System.out.println("\n" + name + ":-");
			mf = new HDFC(amount, duration);
			mf.amount();
			mf.duration();

		}
	}

}
