package com.epam.rd.autocode.iterator;

import java.util.Iterator;

class Iterators {

    public static Iterator<Integer> intArrayTwoTimesIterator(int[] array){
        return new IntArrayTwoTimesIteratorImplementation(array);
    }

    public static Iterator<Integer> intArrayThreeTimesIterator(int[] array) {
        return new IntArrayThreeTimesIteratorImplementation(array);
    }

    public static Iterator<Integer> intArrayFiveTimesIterator(int[] array) {
        return new IntArrayFiveTimesIteratorImplementation(array);
        }

    public static Iterable<String> table(String[] columns, int[] rows){
        return (Iterable<String>) new TableIteratorImplementation(columns, rows);
    }
}
