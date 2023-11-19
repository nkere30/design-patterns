package com.epam.rd.autocode.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntArrayThreeTimesIteratorImplementation implements Iterator {
    private int[] array;
    private int counter;
    private int index;
    private static final int N_TIMES_ITERATOR = 3;
    public IntArrayThreeTimesIteratorImplementation(int[] array) {
        this.array = array;
        index = 0;
        counter = 0;
    }
    @Override
    public boolean hasNext() {
        return index < array.length && counter < N_TIMES_ITERATOR;
    }

    @Override
    public Integer next() {
        if(!hasNext()) throw new NoSuchElementException();
        int result = array[index];
        counter++;
        if (counter == N_TIMES_ITERATOR) {
            counter = 0;
            index++;
        }
        return result;
    }
}
