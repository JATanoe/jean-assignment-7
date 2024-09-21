package com.coderscampus.arraylist;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	public void test_capacity_resizing() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		int initialCapacity = 10;
		int numberItemsToAdd = 23;

		// Act
		for (int i = 0; i < numberItemsToAdd; i++) {
			customList.add("Item " + i);
		}

		assertEquals("Item 0", customList.get(0));
		assertEquals("Item 22", customList.get(22));
		assertEquals(numberItemsToAdd, customList.getSize());
	}

	@Test
	public void test_add_at_index_out_of_bounds() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            customList.add(1, "Banana"); 
        });

        customList.add("Apple");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            customList.add(2, "Orange"); 
        });
	}

	@Test
	void test_add_1_item() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		customList.add("item " + 10);
		String expectedResult = customList.get(0);
		Integer expectedSize = customList.getSize();

		// Assert
		assertEquals("item 10", expectedResult);
		assertEquals(1, expectedSize);
	}

	@Test
	void test_add_11_items() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 11; i++) {
			customList.add("item " + i);
		}

		// Assert
		assertEquals("item 0", customList.get(0));
		assertEquals("item 1", customList.get(1));
		assertEquals("item 2", customList.get(2));
		assertEquals("item 3", customList.get(3));
		assertEquals("item 4", customList.get(4));
		assertEquals("item 5", customList.get(5));
		assertEquals("item 6", customList.get(6));
		assertEquals("item 7", customList.get(7));
		assertEquals("item 8", customList.get(8));
		assertEquals("item 9", customList.get(9));
		assertEquals("item 10", customList.get(10));

		assertEquals(11, customList.getSize());
	}

	@Test
	void test_add_100001_items() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 100001; i++) {
			customList.add(i, "item " + i);
		}

		// Assert
		assertEquals(100001, customList.getSize());
	}

	@Test
	void test_add_100000002_items() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 100000002; i++) {
			customList.add(i, "item " + i);
		}

		// Assert
		assertEquals(100000002, customList.getSize());
	}

	@Test
	void test_add_items_at_index() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 75; i++) {
			if (i % 7 == 0) {
				customList.add(i, "Element added at index " + i);
			}
			customList.add("Element at index " + i);
		}

		// Assert
		assertEquals("Element added at index 7", customList.get(7));
		assertEquals("Element at index 56", customList.get(66));
		assertEquals("Element added at index 21", customList.get(21));
		assertEquals("Element at index 4", customList.get(5));
		assertEquals(86, customList.getSize());
	}

	@Test
	void test_get_size() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 31; i++) {
			customList.add("Element at index " + i);
		}

		// Assert
		assertEquals(31, customList.getSize());
	}

	@Test
	void test_get_item() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 12; i++) {
			customList.add("Element at index " + i);
		}

		// Assert
		assertEquals("Element at index 2", customList.get(2));
		assertEquals("Element at index 10", customList.get(10));
		assertEquals(12, customList.getSize());
	}

	@Test
	void test_get_item_at_index_out_of_bounds() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            customList.get(0); 
        });

        customList.add("Apple");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            customList.get(1);
        });
	}

	@Test
	void test_get_null_value() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Assert
		assertTrue(customList.add(null)); // Add null value
		assertEquals(1, customList.getSize());
		assertNull(customList.get(0));
	}

	@Test
	public void test_add_null_at_index() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		customList.add("Apple");
		customList.add(null);
		customList.add(1, null);

		// Assert
		assertEquals(3, customList.getSize());
		assertEquals("Apple", customList.get(0));
		assertNull(customList.get(1));
		assertNull(customList.get(2));
	}

	@Test
	void test_remove_item_at_index() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Act
		for (int i = 0; i < 8; i++) {
			customList.add("Element at index " + i);
		}

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

	@Test
	public void test_remove_at_index_out_of_bounds() {
		// Arrange
		CustomList<String> customList = new CustomArrayList<>();

		// Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            customList.remove(1); 
        });

        customList.add("Apple");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            customList.remove(2); 
        });
	}

}
