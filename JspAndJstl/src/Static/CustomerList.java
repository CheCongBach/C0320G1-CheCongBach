package Static;

import Customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public static List<Customer> getCustomer() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Suzumiza Kotone",28,"27/06/1992","Japan","images/jav1.jpeg"));
        customerList.add(new Customer(2,"Abe Mikako",26,"21/02/1994","Japan","images/jav2.jpeg"));
        customerList.add(new Customer(3,"Tsukasa Aoi",30,"14/08/1990","Japan","images/jav3.jpeg"));
        customerList.add(new Customer(4,"Megi Fujiura",28,"26/04/1994","Japan","images/jav4.jpeg"));
        customerList.add(new Customer(5,"Akiho Yoshizawa",35,"25/07/1984","Japan","images/jav5.jpeg"));
        customerList.add(new Customer(6,"Saori Hara",31,"27/06/1988","Japan","images/jav6.jpeg"));
        customerList.add(new Customer(7,"Aizawa Minami",33,"21/02/1986","Japan","images/jav7.jpeg"));
        customerList.add(new Customer(8,"Eimi Fukada",32,"14/08/1987","Japan","images/jav8.jpeg"));
        customerList.add(new Customer(9,"Yurina Ayashiro",27,"24/02/1993","Japan","images/jav9.jpeg"));
        customerList.add(new Customer(10,"Ayano Nana",25,"25/07/1995","Japan","images/jav10.jpeg"));
        return customerList;
    }
}
