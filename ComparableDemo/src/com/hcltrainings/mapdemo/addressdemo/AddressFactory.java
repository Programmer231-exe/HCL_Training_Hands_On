package com.hcltrainings.mapdemo.addressdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class AddressFactory {
	private static List<Address> addressGenerator() {
		List<Address> addressList = new ArrayList<Address>();
		int count;
		String detail = null;
		String[] splittedDetail;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the number of addresses you want to add");
			count = Integer.parseInt(br.readLine());

			for (int i = 0; i < count; i++) {
				System.out.println(
						"Enter the address " + (i + 1) + " Details(addressline1,addressline2,city,state,pincode)");
				detail = br.readLine();
				splittedDetail = detail.split(",");
				addressList.add(new Address(splittedDetail[0], splittedDetail[1], splittedDetail[2], splittedDetail[3],
						Integer.parseInt(splittedDetail[4])));
			}
		} catch (IOException ioe) {
			System.err.println("Some problem with reading");
		}

		return addressList;

	}

	private static HashMap<String, ArrayList<Address>> addressMapGenerator() {
		List<Address> addresss = addressGenerator();
		List<String> rejected = new ArrayList<String>();
		String city;
		HashMap<String, ArrayList<Address>> mappedAddress = new HashMap<String, ArrayList<Address>>();
		for (int i = 0; i < addresss.size(); i++) {
			city = addresss.get(i).getCity();
			if (rejected.contains(city)) {
				System.out.print("");
			} else {
				mappedAddress.put(city, getAddressList(city, addresss));
			}

			rejected.add(city);
		}
		return mappedAddress;
	}

	private static ArrayList<Address> getAddressList(String city, List<Address> addresss) {
		ArrayList<Address> addressofSameCity = new ArrayList<Address>();
		addressofSameCity.removeAll(addressofSameCity);

		for (int j = 0; j < addresss.size(); j++) {
			if (city.equals(addresss.get(j).getCity())) {
				addressofSameCity.add(addresss.get(j));
			}

		}

		return addressofSameCity;

	}

	public static HashMap<String, HashMap<String, ArrayList<Address>>> finalMappedAddress() {
		HashMap<String, ArrayList<Address>> mappedAddress = addressMapGenerator();
		HashMap<String, HashMap<String, ArrayList<Address>>> finalAddressList = new HashMap<String, HashMap<String, ArrayList<Address>>>();
		Set<String> keys = mappedAddress.keySet();
		String key = String.join(",", keys);
		String[] keyss = key.split(",");
		for (int i = 0; i < keyss.length; i++) {
			String state = mappedAddress.get(keyss[i]).get(0).getState();
			finalAddressList.put(state, getMappedAddress(state, mappedAddress));
		}
		return finalAddressList;

	}

	private static HashMap<String, ArrayList<Address>> getMappedAddress(String state,
			HashMap<String, ArrayList<Address>> mappedAddress) {
		HashMap<String, ArrayList<Address>> stateaddress = new HashMap<String, ArrayList<Address>>();
		List<Address> address;
		Set<String> keys = mappedAddress.keySet();
		String keysss = String.join(",", keys);
		String[] keyss = keysss.split(",");
		String localState;
		for (int j = 0; j < keyss.length; j++) {
			address = mappedAddress.get(keyss[j]);
			localState = address.get(0).getState();
			if (state.equals(localState)) {
				stateaddress = mappedAddress;
			}

		}
		return stateaddress;
	}
}
