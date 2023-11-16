package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // FixedList of Integers with max size of 3
        FixedList<Integer> numbers = new FixedList<>(3);

        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // This line should fail

        System.out.println("Number of items in the numbers list: " + numbers.getItems().size());

        // FixedList of LocalDates with max size of 2
        FixedList<LocalDate> dates = new FixedList<>(2);

        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now()); // This line should fail

        System.out.println("Number of dates in the list: " + dates.getItems().size());
    }
}
