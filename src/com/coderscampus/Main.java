package com.coderscampus;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

public class Main {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();
		
		System.out.println("------ Step 1 ------");
		int index = 0;
		while (index < 12) {
			myCustomList.add("element " + index);	
			index++;
		}
		
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index: " + i + ", value: " + myCustomList.get(i));
		}
	
		System.out.println("------ Step 2 ------");
		myCustomList.add(9, "Complete assignment");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index: " + i + ", value: " +myCustomList.get(i));
		}
		
		System.out.println(myCustomList.getSize());
	
		System.out.println("------ Step 3 ------");
		myCustomList.remove(9);

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index: " + i + ", value: element " +myCustomList.get(i));
		}
		
		System.out.println(myCustomList.getSize());


	}

}
