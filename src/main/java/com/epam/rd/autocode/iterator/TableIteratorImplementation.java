package com.epam.rd.autocode.iterator;

import java.util.Iterator;

public class TableIteratorImplementation implements Iterable<String>, Iterator{
    private String[] columns;
    private int[] rows;
    private int columnIndex;
    private int rowIndex;
    public TableIteratorImplementation(String[] columns, int[] rows) {
        this.columns = columns;
        this.rows = rows;
        this.columnIndex = 0;
        this.rowIndex = 0;
    }
    @Override
    public Iterator<String> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return columnIndex < columns.length && rowIndex < rows.length;
    }

    @Override
    public Object next() {
        String result = columns[columnIndex] + rows[rowIndex];
        rowIndex++;
        if (rowIndex == rows.length) {
            rowIndex = 0;
            columnIndex++;
        }
        return result;
    }
}
