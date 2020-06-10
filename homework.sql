create database myhomework;
create table myhomework.category(
category_id int(20) auto_increment,
category_name varchar(50) not null,
primary key(category_id)
);
create table myhomework.supplier(
supplier_id int(20) auto_increment,
supplier_name varchar(50) not null,
supplier_phone int(20),
supplier_address varchar(50),
primary key(supplier_id)
);
create table myhomework.products(
products_id int auto_increment,
products_name varchar(50) not null,
products_image varchar(50),
products_price int(20) not null,
products_discount int(20) not null,
products_inventory varchar(50) not null,
id_category int(20) not null,
id_supplier int(20) not null,
primary key(products_id),
foreign key(id_category) references category(category_id),
foreign key(id_supplier) references supplier(supplier_id)
);
create table myhomework.customer(
customer_id int(20) auto_increment,
customer_name varchar(30) not null,
customer_phone varchar(40) not null unique,
customer_address varchar(40) not null,
customer_email varchar(40) not null unique,
primary key(customer_id)
);
create table myhomework.employee(
employee_id int(20) auto_increment,
employee_name varchar(40) not null,
employee_phone int(20) not null unique,
employee_age int(5) not null,
employee_address varchar(50) not null,
primary key(employee_id)
);
create table myhomework.orders(
orders_id int(20) auto_increment,
orders_status varchar(50) not null,
orders_payment int(20) not null,
id_customer int(20) not null,
id_employee int(20) not null,
primary key(orders_id),
foreign key(id_customer) references customer(customer_id),
foreign key(id_employee) references employee(employee_id)
);
create table myhomework.orderdentail(
orderdentail_id int(20) auto_increment,
id_products int(20) not null,
id_orders int(20) not null,
primary key(orderdentail_id),
foreign key(id_products) references products(products_id),
foreign key(id_orders) references orders(orders_id)
);
insert into `category` values (1,'Điện thoại'),(2,'Xe cộ'),(3,'Xe máy'),(4,'Máy tính & laptop'),(5,'Đồng hồ'),(6,'Máy ảnh'),(7,'Mỹ phẩm'),(8,'Đồ chơi'),(9,'Áo quần'),(10,'Bất động sản');
insert into `supplier` values (1,'Apple',0905123456,'USA'),(2,'VinGroup',0905456789,'VN'),(3,'SamSung',123456789,'HQ'),(4,'Honda',0935123456,'JP'),(5,'LV',0935456789,'Italia'),(6,'Ohui',123456789,'HQ'),(7,'Dell',0932123456,'USA'),(8,'Canon',0932456789,'JP'),(9,'Rolex',0964123456,'Thụy Sĩ'),(10,'Fisher Price',0964456789,'USA');
