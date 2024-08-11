package com.coderscampus;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

public class Main {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();
		
		int index = 0;
		while (index < 12) {
			myCustomList.add("element " + index);	
			index++;
		}

		myCustomList.add(9, "Complete assignment");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index: " + i + ", value: element " +myCustomList.get(i));
		}
		
		System.out.println(myCustomList.getSize());
		
		myCustomList.remove(9);

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index: " + i + ", value: element " +myCustomList.get(i));
		}
		
		System.out.println(myCustomList.getSize());


	}

}
