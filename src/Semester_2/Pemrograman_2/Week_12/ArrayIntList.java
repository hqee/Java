package Semester_2.Pemrograman_2.Week_12;

import java.util.*;

public class ArrayIntList {
    private int[] elementData; // list of integers
    private int size; // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 10;

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // pre : capacity >= 0 (throws IllegalArgumentException if not)
    // post: constructs an empty list with the given capacity
    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elementData = new int[capacity];
        size = 0;
    }

    // pre : size() < capacity (throws IllegalStateException if not)
    // post: appends the given value to the end of the list
    public void add(int value) {
        ensureCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    // pre : size() < capacity (throws IllegalStateException if not) &&
    // 0 <= index <= size() (throws IndexOutOfBoundsException if not)
    // post: inserts the given value at the given index, shifting subsequent
    // values right
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // pre: size() + other.size() <= capacity (throws IllegalStateException
    // if not)
    // post: appends all values in the given list to the end of this list
    public void addAll(ArrayIntList other) {
        ensureCapacity(size + other.size);
        for (int i = 0; i < other.size; i++) {
            add(other.elementData[i]);
        }
    }

    // post: list is empty
    public void clear() {
        size = 0;
    }

    // post: returns true if the given value is contained in the list,
    // false otherwise
    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }

    // post: ensures that the underlying array has the given capacity; if not,
    // the size is doubled (or more if given capacity is even larger)
    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2 + 1;
            if (capacity > newCapacity) {
                newCapacity = capacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: returns the integer at the given index in the list
    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    // post : returns the position of the first occurrence of the given
    // value (-1 if not found)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // post: returns true if list is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // post: returns an iterator for this list
    public ArrayIntList iterator() {
        return new ArrayIntList();
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: replaces the integer at the given index with the given value
    public void set(int index, int value) {
        checkIndex(index);
        elementData[index] = value;
    }

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    // post: throws an IndexOutOfBoundsException if the given index is
    // not a legal index of the current list
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    public void mystery() {
        int n = 0;
        for (int i = 0; i < size; i++) {
            n += elementData[i] * i;
        }
        elementData[size] = n;
        size++;
    }

    public boolean isPairwiseSorted() {
        for (int i = 0; i < size - 1; i += 2) {
            if (elementData[i] > elementData[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public ArrayIntList runningTotal() {
        ArrayIntList newList = new ArrayIntList(size);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += elementData[i];
            newList.add(sum);
        }
        return newList;
    }

    public void removeFront(int n) {
        if (n < 0 || n > size) {
            throw new IllegalArgumentException("Invalid value for n: " + n);
        }
        for (int i = 0; i < size - n; i++) {
            elementData[i] = elementData[i + n];
        }
        size -= n;
    }

    public void removeAll(int value) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i] != value) {
                elementData[index] = elementData[i];
                index++;
            }
        }
        size = index;
    }

    public void stretch(int n) {
        if (n <= 0) {
            clear();
        } else {
            int[] stretchedData = new int[size * n];
            int index = 0;
            for (int i = 0; i < size; i++) {
                int value = elementData[i];
                for (int j = 0; j < n; j++) {
                    stretchedData[index] = value;
                    index++;
                }
            }
            elementData = stretchedData;
            size = size * n;
        }
    }

    public int longestSortedSequence() {
        if (size == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < size; i++) {
            if (elementData[i] >= elementData[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        return Math.max(maxLength, currentLength);
    }
}
