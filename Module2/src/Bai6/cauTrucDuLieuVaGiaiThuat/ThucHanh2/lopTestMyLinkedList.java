package Bai6.cauTrucDuLieuVaGiaiThuat.ThucHanh2;

public class lopTestMyLinkedList {
    public static void main(String[] args) {
        lopLinkedList linkedList = new lopLinkedList(3);
        linkedList.addFirst(1);
       linkedList.addFirst(12);
       linkedList.addFirst(13);

        linkedList.add(0,9);
        linkedList.add(1,10);
        //linkedList.add(2,15);
        //linkedList.add(4,15);
        linkedList.printList();
    }
}
