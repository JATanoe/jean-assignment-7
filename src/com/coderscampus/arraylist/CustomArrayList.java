package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	private Object[] items = new Object[10];
	private int count = 0; // Count the number of item to add

	@Override
	public boolean add(T item) {
		if (count >= getSize()) resize();
		if (items[count] == null) items[count] = item;
		count++;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index >= getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", count: " + getSize());
		}
		
		if (count >= getSize()) resize();
		
		for (int i = count; i > index; i--) {
			items[i] = items[i - 1];
		}
		
		items[index] = item;
		count++;
 		
		return true;
	}
	
	@Override
	public int getSize() {
		return items.length;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index >= getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", count: " + getSize());
		}

		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= count)
        	throw new IndexOutOfBoundsException("Index: " + index + ", count: " + count);

        T item = (T) items[index];

        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        items[count - 1] = null;
        count--;

        return item;
	}

	private void resize() {		
		items = Arrays.copyOf(items, items.length * 2);
	}

}
