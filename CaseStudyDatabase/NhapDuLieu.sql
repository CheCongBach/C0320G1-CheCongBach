USE casestudy;
/* Nhập dữ liệu cho bảng vị trí **/
INSERT INTO location(location_id, location_name)
value (1,'Giám Đốc'),(2,'Lễ Tân'),(3,'Phục Vụ'),(4,'Chuyên Viên'),(5,'Giám Sát'),(6,'Quản Lí');
/* Nhập dữ liệu cho bảng trình độ **/
INSERT INTO level(level_id, level_name) value (1,'Đại Học'),(2,'Cao Đẳng'),(3,'Trung Cấp'),(4,'Sau Đại Học');
/* Nhập dữ liệu cho bảng bộ phận **/
INSERT INTO parts(parts_id, parts_name) value (1,'Sale-Marketing'),(2,'Hành chính'),(3,'Phục Vụ'),(4,'Quản Lí');
/* Nhập dữ liệu cho bảng nhân viên **/
INSERT INTO employee(employee_id, employee_name, employee_birthday, employee_phone, employee_address, employee_email, employee_identityCard, employee_salary, location_id, level_id, parts_id)
value (1,'Lý Hồng Giang','2000-03-17',0905123456,'Đà Nẵng','giang@gmail.com',35053344,6500000,2,2,3),
    (2,'Đặng Nam Sơn','1989-05-29',0905456789,'Đà Nẵng','nam@gmail.com',26413995,11000000,6,1,4),
    (3,'Nguyễn Thế Phương','1992-08-02',0935123456,'Quảng Nam','phuong@gmail.com',84970508,12500000,5,1,2),
    (4,'Lê Hữu Khôi','1990-02-12',0935456789,'Quảng Nam','khoi@gmail.com',80959894,11500000,4,1,1),
    (5,'Hà Bích Như','1993-07-16',0912123456,'Huế','nhu93@gmail.com',63949875,8000000,2,2,3),
    (6,'Phạm Khánh Vi','1997-05-05',0912456789,'Huế','vi123@gmail.com',10121389,8500000,2,1,3),
    (7,'Trần Quỳnh Giao','1995-06-07',0913123456,'Quảng Trị','giao@gmail.com',96047534,8200000,2,2,3),
    (8,'Nguyễn Duy Khiêm','1988-08-03',0913456789,'Đà Nẵng','khiem@gmail.com',35645894,16000000,1,1,1),
    (9,'Chung Thúy Vy','1990-12-09',0914123456,'Huế','vy@gmail.com',24763450,15500000,1,1,2),
    (10,'Vương Hồng Nga','1992-04-13',0914456789,'Quảng Trị','nga@gmail.com',51248762,15200000,1,1,3),
    (11,'Nguyễn Gia Uy','1985-05-14',0915123456,'Quảng Ngãi','uy@gmail.com',13725165,16000000,1,1,4),
    (12,'Trần Huy Quang','1983-07-16',0915456789,'Quảng Ngãi','quang@gmail.com',33259768,9500000,4,1,2),
    (13,'Trương Minh Nguyệt','1998-03-12',0916123456,'Cần Thơ','nguyet@gmail.com',48642151,6000000,3,3,3),
    (14,'Nguyễn Kiều Loan','1995-08-16',0916456789,'QUảng Bình','loan@gmail.com',53387214,7600000,4,4,2),
    (15,'Trần Tấn Nam','1996-06-16',0917123456,'Quảng Bình','nam123@gmail.com',56821056,8500000,6,2,4),
    (16,'Trần Tuấn Chương','1988-05-06',0378377484,'Huế','chuong123@gmail.com',25845213,7500000,4,2,2),
    (17,'Nguyễn Uyển Như','1995-12-02',0378123456,'Quảng Trị','uyennhu@gmail.com',42180290,7300000,4,3,1),
    (18,'Lý Lan Hương','1994-03-03',0988888876,'Đà Nẵng','lanhuong94@gmail.com',44581178,7000000,2,2,3),
    (19,'Thi Hà My','1998-06-07',0363644447,'Quảng Ngãi','hamy98@gmail.com',14419477,6200000,3,3,3),
    (20,'Hoàng Thục Vân','1990-08-09',0909099990,'Huế','vanvan123@gmail.com',59877144,8900000,4,1,2);
/* Nhập dữ liệu cho bảng loại khách hàng **/
INSERT INTO typecustomer(typeCustomer_id, typeCustomer_name) value (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,'Silver'),(5,'Member');
/* Nhập dữ liệu cho bảng khách hàng **/
INSERT INTO customer(customer_id, customer_name, customer_birthday, customer_identityCard, customer_phone, customer_email, customer_address, typeCustomer_id)
value (1,'Ngô Phúc Hưng','1997-01-18',83266830,0934123456,'hung@gmail.com','Đà Nẵng',1),
    (2,'Hồ Ngọc Trâm','1995-02-23',51220350,0934456789,'tram@gmail.com','Huế',2),
    (3,'Cao Quỳnh Anh','1997-05-13',77467511,0916123456,'anh@gmail.com','Quảng trị',2),
    (4,'Lê Ái Vân','1993-07-11',78190617,0905098123,'van@gmail.com','Sài Gòn',2),
    (5,'Hoàng Minh Khang','1996-04-15',82641239,0932067456,'khang@gmail.com','Quảng nam',2),
    (6,'Nguyễn Phúc Nguyên','2000-04-04',13094486,0918123456,'nguyen123@gmail.com','Hà Nội',2),
    (7,'Tống Trang Nhã','2001-12-02',27827124,0974123456,'nha456@gmail.com','Huế',2),
    (8,'Phan Ðình Trung','1998-03-03',71680812,0974456789,'trungx9@gmail.com','Quảng Trị',3),
    (9,'Ân Quốc Hoàn','1992-08-09',30622980,0908077653,'hoanAn@gmail.com','Quảng Trị',3),
    (10,'Phan Mỹ Lan','2001-12-01',71418518,0909011702,'lan01@gmail.com','Đà Nẵng',3),
    (11,'Nguyễn Kiều Nga','1997-09-09',13587585,0907897123,'nga97@gmail.com','Huế',4),
    (12,'Võ Hoàng Việt','1993-04-05',89619773,0945456123,'vietxyz@gmail.com','Quảng Nam',4),
    (13,'Bùi Thiên Nga','2004-05-09',94395690,0954047753,'nga0905@gmail.com','Quảng Ngãi',1),
    (14,'Đỗ Hữu Ðịnh','1991-01-11',92717345,0989097703,'dinh91@gmail.com','Quảng Trị',4),
    (15,'Bùi Quang Minh','2000-08-07',48479080,0909093123,'minh0708@gmail.com','Vinh',1),
    (16,'Nguyễn Diễm Khuê','1999-04-06',16466270,0923233233,'khuekhue@gmail.com','Huế',1),
    (17,'Phan Nhật Tấn','2001-09-09',51551719,0908077662,'tanphan@gmail.com','Sài Gòn',4),
    (18,'Tô Bích Như','1994-03-04',30668052,0374044665,'nhu94@gmail.com','Quảng Ngãi',4),
    (19,'Thái Bích Ngân','1992-03-05',99599552,0363123456,'nganngan@gmail.com','Đà Nẵng',4),
    (20,'Cao Ngọc Ngạn','2000-02-03',77718034,0969696456,'ngancao@gmail.com','Đà Nẵng',4);
/* Nhập dữ liệu cho bảng kiểu cho thuê **/
INSERT INTO typerent(typeRent_id, typeRent_name, typeRent_price)
value (1,'hour',300000),(2,'day',2000000),(3,'month',10000000),(4,'year',120000000);
/* Nhập dữ liệu cho bảng kiểu dịch vụ **/
INSERT INTO typeservice(typeService_id, typeService_name) value (1,'Villa'),(2,'House'),(3,'Room');
/* Nhập dữ liệu cho bảng dịch vụ **/
INSERT INTO service(service_id, service_name, service_area, service_numberOfFloor, service_maxNumber, service_rentalCosts, service_status, typeRent_id, typeService_id)
value (1,'Red Villa',120,3,12,20000000,'Đã cho thuê',2,1),
      (2,'Blue Villa',140,4,16,22000000,'Còn trống',3,1),
      (3,'White Villa',160,6,20,24000000,'Đã cho thuê',3,1),
      (4,'Pink Villa',200,6,25,26000000,'Còn trống',3,1),
      (5,'Black Villa',220,8,30,28000000,'Đã cho thuê',4,1),
      (6,'Red House',100,3,10,5000000,'Đã cho thuê',2,2),
      (7,'Blue House',115,3,11,6000000,'Còn trống',2,2),
      (8,'White House',125,4,15,7000000,'Còn trống',3,2),
      (9,'Pink House',130,4,16,8000000,'Đã cho thuê',4,2),
      (10,'Black House',135,5,20,9000000,'Còn trống',3,2),
      (11,'Room 01',35,2,2,800000,'Đã cho thuê',1,3),
      (12,'Room 02',40,2,2,900000,'Còn trống',1,3),
      (13,'Room 03',45,3,3,1000000,'Đã cho thuê',2,3),
      (14,'Room 04',50,3,3,1100000,'Còn trống',2,3),
      (15,'Room 05',55,4,4,1200000,'Đã cho thuê',2,3),
      (16,'Room 06',60,4,4,2000000,'Còn trống',2,3),
      (17,'Room 07',65,5,5,2500000,'Đã cho thuê',3,3),
      (18,'Room 08',70,5,5,3000000,'Còn trống',3,3),
      (19,'Room 09',75,6,8,3500000,'Còn trống',4,3),
      (20,'Room 10',90,6,10,4000000,'Đã cho thuê',4,3);
/* Nhập dữ liệu cho bảng dịch vụ đi kèm **/
INSERT INTO accompaniedservice(accompaniedService_id, accompaniedService_name, accompaniedService_unit, accompaniedService_price)
value (1,'Massage',20,750000),(2,'Karaoke',15,250000),(3,'Thức ăn',20,450000),(4,'Nước uống',20,150000),
      (5,'Xe di chuyển tham quan resort',10,200000);
/* Nhập dữ liệu cho bảng hợp đồng **/
INSERT INTO contract(contract_id, contract_date, contract_end_date, contract_deposits,contract_totalMoney, employee_id, customer_id, service_id)
value (1,'2018-05-13','2018-05-20',2000000,20000000,4,1,1),
      (2,'2019-04-04','2019-09-04',2200000,22000000,14,2,3),
      (3,'2018-05-05','2019-05-05',7000000,124000000,8,6,5),
      (4,'2019-06-08','2019-06-22',400000,5000000,14,11,6),
      (5,'2018-01-10','2019-01-10',1280000,115000000,20,12,9),
      (6,'2018-05-16','2018-05-16',0,800000,17,17,11),
      (7,'2019-08-09','2019-09-10',0,5000000,9,13,13),
      (8,'2018-10-10','2018-10-12',0,2400000,7,15,15),
      (9,'2019-04-15','2019-05-15',0,12000000,13,4,17),
      (10,'2019-05-16','2020-05-16',0,3000000,15,14,20),
      (11,'2019-12-12','2020-12-12',7000000,8500000,4,1,2),
      (12,'2019-11-11','2019-11-18',0,7000000,1,16,19),
      (13,'2019-10-15','2019-10-20',0,3300000,9,20,14),
      (14,'2019-12-24','2020-01-31',0,3500000,4,20,18),
      (15,'2019-05-05','2019-05-12',0,1800000,14,17,12);
INSERT INTO contractdetails(contractDetails_id, accompaniedService_id, contract_id, contractDetails_amount)
value (1,1,1,7),(2,2,2,8),(3,3,6,2),(4,4,3,7),(5,5,10,3),(6,5,7,2),(7,1,11,6),(8,2,12,6),(9,1,13,9),(10,1,8,2),(11,1,7,3);
