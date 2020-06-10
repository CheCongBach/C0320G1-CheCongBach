package Bai6.cauTrucDuLieuVaGiaiThuat.BaiTap1;

import java.util.Arrays;

public class myArraysList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY1 = 10;
    private Object[] elements;

    public myArraysList() {
        elements = new Object[DEFAULT_CAPACITY1];
    }

    public myArraysList(int DEFAULT_CAPACITY2) {
        elements = new Object[DEFAULT_CAPACITY2];
    }

    private void duplicate() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(int number) {
        if (size == elements.length) {
            duplicate();
        }
        elements[size] = number;
        size++;
    }

    public void remove(int index) {
        for (int i = 0; i < elements.length; i++) {

        }
    }
}
