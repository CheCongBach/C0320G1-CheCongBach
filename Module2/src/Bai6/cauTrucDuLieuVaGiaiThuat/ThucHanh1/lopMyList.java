package Bai6.cauTrucDuLieuVaGiaiThuat.ThucHanh1;

import java.util.Arrays;

/**Bước 1: Tạo lớp MyList với các thuộc tính như mô tả
Các thuộc tính
 + size xác định số phần tử trong danh sách, mặc định gán là 0.
 + DEFAULT_CAPACITY lưu số phần tử đối đa trong danh sách mặc định là 10.
 + Mảng đối tượng elements chứa các phần tử trong danh sách
Các phương thức:
 + Phương thức khởi tạo không tham số
 + Phương thức thêm một phần tử mới vào danh sách: add()
 + Phương thức thay đổi số phần tử tối đa trong danh sách: ensureCapa()
 + Phương thức truy cập một phần tử trong danh sách: get()
 + Lớp MyListTest chứa phương thức main() để thực thi ứng dụng*/
public class lopMyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public lopMyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**Bước 2: Cài đặt phương thức ensureCapa()
    + Mục đích: Tăng gấp đôi kích thước mảng chứa các phần tử*/
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    /**Bước 3: Cài đặt phương thức add()
    + Mục đích: thêm một phần tử vào cuối của danh sách
    + Tham số đầu vào: phần tử cần thêm vào danh sách*/
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    /**Bước 4: Cài đặt phương thức get()
    + Mục đích: Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
    + Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách*/
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
