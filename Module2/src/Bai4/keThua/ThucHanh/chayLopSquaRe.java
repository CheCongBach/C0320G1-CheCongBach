package Bai4.keThua.ThucHanh;

public class chayLopSquaRe {
    public static void main(String[] args) {
        lopSquaRe thucThi = new lopSquaRe();
        System.out.println(thucThi);

        thucThi = new lopSquaRe(2.3);
        System.out.println(thucThi);

        thucThi = new lopSquaRe(5.8, "yellow", true);
        System.out.println(thucThi);
    }
}
