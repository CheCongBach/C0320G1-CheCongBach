package Bai6.cauTrucDuLieuVaGiaiThuat.ThucHanh1;

public class lopMyListTest {
    public static void main(String[] args) {
       lopMyList<Integer> integerMylist = new lopMyList<Integer>();
       integerMylist.add(1);
       integerMylist.add(1);
       integerMylist.add(3);
       integerMylist.add(4);

        System.out.println("element 1: " + integerMylist.get(0));
        System.out.println("element 2: " + integerMylist.get(1));
        System.out.println("element 3: " + integerMylist.get(2));
        System.out.println("element 4: " + integerMylist.get(3));

       integerMylist.add(6);
        System.out.println("element 5: " + integerMylist.get(4));

       integerMylist.add(-1);
        System.out.println("element 6: " + integerMylist.get(5));
    }
}
