package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    // Store list of items and the max size of the list
    private List<T> items;
    private int maxSize;

    // Constructor to initialize the FixedList with a specified max size
    public FixedList(int maxSize) {
        if (maxSize <= 0) {
            this.maxSize = 10;
        } else {
            this.maxSize = maxSize;
        }
        // Initialize the items list with the specified max
        this.items = new ArrayList<>(maxSize);
    }

    // Method to add an item to the list if the current size is less than the max size
    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        }
    }

    // Method to retrieve a copy of the items in the list
    public List<T> getItems() {
        // Return a new ArrayList containing the same elements as the original list
        return new ArrayList<>(items);
    }

    // Method to get the current size of the list
    public int size() {
        return items.size();
    }

    // Method to get the max size allowed for the list
    public int getMaxSize() {
        return maxSize;
    }
}
