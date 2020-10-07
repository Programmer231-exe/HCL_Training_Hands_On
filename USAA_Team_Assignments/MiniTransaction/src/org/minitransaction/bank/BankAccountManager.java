package org.minitransaction.bank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankAccountManager {
	public static String username;
	private static BufferedReader br = null;

	public static void welcome() {

		System.out.println("Enter the name to fetch the transaction details");
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			username = br.readLine().trim();
		} catch (IOException ioe) {
			System.err.println("Error in reading user input");
			System.err.println(ioe.getMessage());
		} finally {
			br = null;
		}
	}

	public static List<BankAccount> getBankAccounts(String username) {
		List<BankAccount> userList = new ArrayList<>();
		BankAccount bankAccount;
		System.out.println("-->Hi");
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("Resources/bankaccount.csv")));
			Stream<String> str = br.lines();
			List<String> users = str.filter((line) -> line.split(",")[0].equals(username)).collect(Collectors.toList());

			if (users.size() == 0) {
				System.err.println("There is no valid user found");
				return null;
			} else {
				for (String user : users) {
					String[] userDetails = user.split(",");
					bankAccount = new BankAccount();
					bankAccount.setName(userDetails[0]);
					bankAccount.setAge(Integer.parseInt(userDetails[1]));
					bankAccount.setGender(userDetails[2].charAt(0));
					bankAccount.setBank(userDetails[3]);
					bankAccount.setCardNumber(Long.parseLong(userDetails[4].trim()));
					bankAccount.setCreditLimit(Double.parseDouble(userDetails[5]));
					bankAccount = getTransactions(bankAccount);
					userList.add(bankAccount);

				}
				return userList;

			}

		} catch (IOException fno) {
			System.err.println("IO Exception File Error");
			System.err.println("File not found in the prescribed path 'Resources/bankaccount.csv");
		} catch (DateTimeParseException de) {
			System.err.println("Check the date format in the csv file, format should be dd/MM/yyyy");
		} finally {
			br = null;
		}

		return null;
	}

	private static BankAccount getTransactions(BankAccount bankaccount) {

		Map<String, List<BankTransaction>> banktrans = new TreeMap<>();
		List<BankTransaction> translog = new ArrayList<>();
		Long cardNumber = bankaccount.getCardNumber();
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("Resources/banktransactions.csv")));
			Stream<String> lines = br.lines();
			lines.filter((line) -> {
				if (Long.parseLong(line.split(",")[0]) == cardNumber)
					return true;
				else
					return false;

			}).map((line) -> {
				String[] transactionDetails = line.split(",");
				BankTransaction bankTranstions = new BankTransaction();
				bankTranstions.setCardNumber(Long.parseLong(transactionDetails[0]));
				bankTranstions.setAmount(Double.parseDouble(transactionDetails[1]));
				bankTranstions.setTransactionDate(
						LocalDate.parse(transactionDetails[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				return bankTranstions;
			}).forEach((str) -> translog.add(str));

			if (translog.size() == 0) {
				System.err.println("There is no transaction record found for the users");
				System.err.println("May be new user");
				return null;
			}

			banktrans.put(bankaccount.getBank(), translog);

			bankaccount.setBanktrans(banktrans);

			return bankaccount;

		} catch (IOException fno) {
			System.err.println("IO Exception File Error");
			System.err.println("File not found in the prescribed path 'Resources/bankaccount.csv");
		} catch (DateTimeParseException de) {
			System.err.println("Check the date format in the csv file, format should be dd/MM/yyyy");
		} finally {
			br = null;
		}
		return null;
	}

	public static void customDisplay(List<BankAccount> lists) {

		System.out.format("\n%-5s %-20s %-20s %-20s %-20s %-20s %-20s", "S.No", "Name", "Bank", "Age", "Gender",
				"TransactionDate", "TransactionAmount\n");
		for(int i = 0 ; i < 125; i++) {
			System.out.print("-");
		}
		int sno = 1;
		for (BankAccount bank : lists) {
			if (bank != null) {
				Set<String> keySets = bank.getBanktrans().keySet();
				int index = 0;
				for (String key : keySets) {

					List<BankTransaction> blist = bank.getBanktrans().get(key);
					for (BankTransaction bankstra : blist) {
						if (index == 0)
							System.out.format("\n%-5d %-20s %-20s %-20d %-20s %-20s %-20s", sno, bank.getName(),
									bank.getBank(), bank.getAge(), bank.getGender(), bankstra.getTransactionDate(),
									bankstra.getAmount());
						else
							System.out.format("\n%-5s %-20s %-20s %-20d %-20s %-20s %-20s", "", "", bank.getBank(),
									bank.getAge(), bank.getGender(), bankstra.getTransactionDate(),
									bankstra.getAmount());

						index++;
					}

				}
				sno++;
			} else {
				System.out.println("\nThere is no valid record to display");
			}
			System.out.println();
			for(int i = 0 ; i < 125; i++) {
				System.out.print("-");
			}
		}
	}
}
