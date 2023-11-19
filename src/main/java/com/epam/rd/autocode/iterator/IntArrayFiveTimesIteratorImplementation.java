package com.epam.rd.autocode.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntArrayFiveTimesIteratorImplementation implements Iterator {
    private int[] array;
    private int index;
    private int counter;
    private static final int N_TIMES_ITERATOR = 5;
    public IntArrayFiveTimesIteratorImplementation(int[] array) {
        this.array = array;
        index = 0;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return index < array.length && counter < N_TIMES_ITERATOR;
    }

    @Override
    public Object next() {
        if(!hasNext()) throw new NoSuchElementException();
        int result = array[index];
        counter++;
        if(counter == N_TIMES_ITERATOR) {
            counter = 0;
            index++;
        }
        return result;
    }
}
