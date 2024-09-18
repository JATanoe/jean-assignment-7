package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	private Object[] items = new Object[10];
	private int size = 0; // Count the number of item to add

	@Override
	public boolean add(T item) {
		setCapacity();
		items[size++] = item;

		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
		}
		
		setCapacity();
		
		for (int i = size; i > index; i--) {
			items[i] = items[i - 1];
		}
		items[index] = item;
		
		size++;
 		
		return true;
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index >= getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size: " + getSize());
		}

		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
        	throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        }

        T item = (T) items[index];

        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }

        items[size - 1] = null;
        size--;

        return item;
	}

	private void setCapacity() {		
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
	}

}
