package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	private Object[] items = new Object[10];
	private int size = 0; // Count the number of item to add

	@Override
	public boolean add(T item) {
		if (this.size >= this.getSize()) this.resize();
		if (this.items[size] == null) this.items[size] = item;
		this.size++;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index >= this.getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.getSize());
		}
		
		if (this.size >= this.getSize()) this.resize();
		
		for (int i = this.size; i > index; i--) {
			this.items[i] = this.items[i - 1];
		}
		
		this.items[index] = item;
		size++;
 		
		return true;
	}
	
	@Override
	public int getSize() {
		return this.size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index >= this.getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.getSize());
		}

		return (T) this.items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size) 
        	throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);

        T item = (T) this.items[index];

        for (int i = index; i < this.size - 1; i++) {
            this.items[i] = this.items[i + 1];
        }

        this.items[this.size - 1] = null;
        this.size--;

        return item;
	}

	private void resize() {		
		this.items = Arrays.copyOf(this.items, this.items.length * 2);
	}

}
