package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item() {
		// Arrange
		CustomList<Integer> customList = new CustomArrayList<>();

		// Act
		customList.add(10);
		Integer expectedResult = customList.get(0);
		Integer expectedSize = customList.getSize();

		// Assert
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
	}

	@Test
	void should_add_item_at_index() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		customList.add("Do");
		customList.add("Mi");
		customList.add("Fa");
		customList.add(1, "Re");

		// Assert
		assertEquals("Do", customList.get(0));
		assertEquals("Re", customList.get(1));
		assertEquals("Mi", customList.get(2));
		assertEquals("Fa", customList.get(3));
		assertEquals(4, customList.getSize());
	}

	@Test
	void should_add_100001_items() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();
		
		// Act
//		customList.add("Do");
//		customList.add("Mi");
//		customList.add("Fa");
//		customList.add(1, "Re");

		for (int i = 0; i < 100001; i++) {
			customList.add(i, "Element " + i);
		}

		// Assert
		assertEquals(100001, customList.getSize());
	}

	@Test
	void should_get_list_size() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		customList.add("Do");
		customList.add("Re");
		customList.add("Mi");
		customList.add("Fa");

		// Assert
		assertEquals(4, customList.getSize());
	}

	@Test
	void should_get_item() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		customList.add("Do");
		customList.add("Re");
		customList.add("Mi");
		customList.add("Fa");

		// Assert
		assertEquals("Mi", customList.get(2));
	}

	@Test
	void should_remove_item_at_index() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		customList.add("Element at index 0");
		customList.add("Element at index 1");
		customList.add("Element at index 2");
		customList.add("Element at index 3");
		customList.add("Element at index 4");
		customList.add("Element at index 5");
		customList.add("Element at index 6");
		customList.add("Element at index 7");
		
		String expectedResult1 = customList.remove(2);
		String expectedResult2 = customList.remove(5);
		String expectedResult3 = customList.remove(5);

		// Assert
		assertEquals("Element at index 2", expectedResult1);
		assertEquals("Element at index 6", expectedResult2);
		assertEquals("Element at index 7", expectedResult3);
		assertEquals("Element at index 0", customList.get(0));
		assertEquals("Element at index 1", customList.get(1));
		assertEquals("Element at index 3", customList.get(2));
		assertEquals("Element at index 4", customList.get(3));		
		assertEquals("Element at index 5", customList.get(4));
		assertEquals(5, customList.getSize());
	}

}
