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
		customList.add("Do");
		customList.add("Re");
		customList.add("Mi");
		customList.add("Fa");
		String expectedResult = customList.remove(2);

		// Assert
		assertEquals("Mi", expectedResult);
		assertEquals("Do", customList.get(0));
		assertEquals("Re", customList.get(1));
		assertEquals("Fa", customList.get(2));
		assertEquals(3, customList.getSize());
	}

}
