USE casestudy;
/* Câu 2: Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu
    là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự. **/
SELECT *
FROM employee
WHERE (employee_name LIKE 'H%' or employee_name LIKE 'T%' or employee_name LIKE 'K%')
  AND LENGTH(employee_name) < 15;

/* Câu 3: Hiển thị thông tin khách hàng có tuổi từ 18-50 và ở Đà Nẵng hoặc Quảng Trị. **/
SELECT *
FROM customer
WHERE customer_address IN ('Đà Nẵng', 'Quảng Trị')
  AND (CURDATE() - customer_birthday > (18 * 30 * 365) AND CURDATE() - customer_birthday < (50 * 30 * 365));

/* Câu 4: Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số
   lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”. **/
SELECT customer.customer_name, COUNT(contract.contract_id) AS numberOfReservations
FROM customer
         JOIN contract ON customer.customer_id = contract.customer_id
         JOIN typecustomer ON customer.typeCustomer_id = typecustomer.typeCustomer_id
WHERE typecustomer.typeCustomer_name = 'Diamond'
GROUP BY customer.customer_id
ORDER BY numberOfReservations;

/* Câu 5: Hiển thị IDKhachHang,HoTen,TenLoaiKhach,IDHopDong,TenDichVu,NgayLamHopDong,NgayKetThuc,
   TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
   cho tất cả các Khách hàng đã từng đặt phỏng.(Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). **/
SELECT customer.customer_id,
       customer.customer_name,
       typecustomer.typeCustomer_name,
       contract.contract_id,
       contract.contract_date,
       contract.contract_end_date,
       service.service_name,
       SUM(service.service_rentalCosts +
           accompaniedservice.accompaniedService_unit * accompaniedservice.accompaniedService_price)
           AS totalMoney
FROM customer
         LEFT JOIN typecustomer ON customer.typeCustomer_id = typecustomer.typeCustomer_id
         LEFT JOIN contract ON customer.customer_id = contract.customer_id
         LEFT JOIN service ON contract.service_id = service.service_id
         LEFT JOIN contractdetails ON contract.contract_id = contractdetails.contract_id
         LEFT JOIN accompaniedservice
                   ON contractdetails.accompaniedService_id = accompaniedservice.accompaniedService_id
GROUP BY customer.customer_id, contract.contract_id;

/* Câu 6: Hiển thị IDDichVu,TenDichVu,DienTich,ChiPhiThue,TenLoaiDichVu của tất cả các
   loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3). **/
SELECT service.service_id,
       service.service_name,
       service.service_area,
       service.service_rentalCosts,
       typeservice.typeService_name
FROM service
         JOIN typeservice ON service.typeService_id = typeservice.typeService_id
WHERE NOT EXISTS(SELECT contract.contract_id
                 FROM contract
                 WHERE (contract.contract_date BETWEEN '2019-01-01' AND '2019-03-31')
                   AND contract.service_id = service.service_id);

/* Câu 7: Hiển thị thông tin IDDichVu,TenDichVu,DienTich,SoNguoiToiDa,ChiPhiThue,TenLoaiDichVu của tất cả các loại dịch vụ
   đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019. **/
SELECT service.service_id,
       service.service_name,
       service.service_area,
       service.service_maxNumber,
       service.service_rentalCosts,
       typeservice.typeService_name
FROM service
         JOIN typeservice ON service.typeService_id = typeservice.typeService_id
WHERE EXISTS(SELECT contract.contract_id
             FROM contract
             WHERE YEAR(contract.contract_date) = '2018'
               AND contract.service_id = service.service_id)
  AND NOT EXISTS(SELECT contract.contract_id
                 FROM contract
                 WHERE YEAR(contract.contract_date) = '2019'
                   AND contract.service_id = service.service_id);

/* Câu 8: Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoTenKhachHang không trùng nhau. **/
/* Cách 1: **/
SELECT DISTINCT customer.customer_name
FROM customer;
/* Cách 2: **/
SELECT customer.customer_name
FROM customer
GROUP BY customer.customer_name;
/* Cách 3: **/
SELECT customer.customer_name
FROM customer
UNION
SELECT customer.customer_name
FROM customer;

/* Câu 9: Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019
   thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng. **/

/* Câu 10: Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
   Kết quả hiển thị bao gồm IDHopDong,NgayLamHopDong,NgayKetthuc,TienDatCoc,SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet). **/
SELECT contract.contract_id,
       contract.contract_date,
       contract.contract_end_date,
       contract.contract_deposits,
       accompaniedservice.accompaniedService_unit,
       COUNT(contractdetails.contractDetails_id) AS DetailedContractId
FROM contract
         LEFT JOIN contractdetails ON contract.contract_id = contractdetails.contract_id
         LEFT JOIN accompaniedservice
                   ON contractdetails.accompaniedService_id = accompaniedservice.accompaniedService_id
GROUP BY contract.contract_id;

/* Câu 11: Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang
   là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”. **/
SELECT acp.accompaniedService_id,
       ct.customer_name,
       acp.accompaniedService_name,
       acp.accompaniedService_unit,
       acp.accompaniedService_price,
       ctr.contract_id,
       ct.customer_address,
       tc.typeCustomer_name
FROM accompaniedservice acp
         LEFT JOIN contractdetails ctdt ON acp.accompaniedService_id = ctdt.accompaniedService_id
         LEFT JOIN contract ctr ON ctdt.contract_id = ctr.contract_id
         LEFT JOIN customer ct ON ctr.customer_id = ct.customer_id
         LEFT JOIN typecustomer tc ON ct.typeCustomer_id = tc.typeCustomer_id
WHERE ct.customer_address IN ('Vinh', 'Quảng Ngãi')
  AND tc.typeCustomer_name = 'Diamond'
GROUP BY acp.accompaniedService_id, ct.customer_name;

/* Câu 12: Hiển thị thông tin IDHopDong,TenNhanVien,TenKhachHang,SoDienThoaiKhachHang,TenDichVu,SoLuongDichVuDikem
   (được tính dựa trên tổng Hợp đồng chi tiết),TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào
   3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019. **/
SELECT contract.contract_id,
       employee.employee_name,
       customer.customer_name,
       customer.customer_phone,
       service.service_name,
       accompaniedservice.accompaniedService_unit,
       contract.contract_deposits
FROM contract
         RIGHT JOIN customer ON contract.customer_id = customer.customer_id
         RIGHT JOIN employee ON contract.employee_id = employee.employee_id
         RIGHT JOIN service ON contract.service_id = service.service_id
         RIGHT JOIN contractdetails ON contract.contract_id = contractdetails.contract_id
         RIGHT JOIN accompaniedservice
                    ON contractdetails.accompaniedService_id = accompaniedservice.accompaniedService_id
WHERE EXISTS(SELECT contract.contract_id
             FROM contract
             WHERE (contract.contract_date BETWEEN '2019-10-01' AND '2019-12-31')
               AND contract.service_id = service.service_id)
  AND NOT EXISTS(SELECT contract.contract_id
                 FROM contract
                 WHERE (contract.contract_date BETWEEN '2019-01-01' AND '2019-09-30')
                   AND contract.service_id = service.service_id)
GROUP BY service.service_id;

/* Câu 13: Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
   (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau). **/
SELECT accompaniedservice.accompaniedService_id,
       accompaniedservice.accompaniedService_name,
       accompaniedservice.accompaniedService_unit,
       accompaniedservice.accompaniedService_price,
       COUNT(contract.contract_id) AS count
FROM accompaniedservice
         JOIN contractdetails ON accompaniedservice.accompaniedService_id = contractdetails.accompaniedService_id
         JOIN contract ON contractdetails.contract_id = contract.contract_id
GROUP BY accompaniedservice.accompaniedService_id
ORDER BY count DESC
LIMIT 1;

/* Câu 14: Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
   Thông tin hiển thị bao gồm IDHopDong,TenLoaiDichVu,TenDichVuDiKem,SoLanSuDung. **/
SELECT contract.contract_id,
       typeservice.typeService_name,
       accompaniedservice.accompaniedService_name,
       COUNT(contract.contract_id) AS numberOfUses
FROM service
         JOIN typeservice ON service.typeService_id = typeservice.typeService_id
         JOIN contract ON service.service_id = contract.service_id
         JOIN contractdetails ON contract.contract_id = contractdetails.contract_id
         JOIN accompaniedservice ON contractdetails.accompaniedService_id = accompaniedservice.accompaniedService_id
GROUP BY accompaniedservice.accompaniedService_id
HAVING numberOfUses = 1;

/* Câu 15: Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien,HoTen,TrinhDo,TenBoPhan,SoDienThoai,DiaChi
   mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019. **/
SELECT employee.employee_id,
       employee.employee_name,
       employee.employee_phone,
       employee.employee_address,
       level.level_name,
       parts.parts_name,
       COUNT(contract.contract_id) AS count
FROM employee
         LEFT JOIN level ON employee.level_id = level.level_id
         LEFT JOIN parts ON employee.parts_id = parts.parts_id
         LEFT JOIN contract ON employee.employee_id = contract.employee_id
WHERE EXISTS(SELECT contract.contract_id
             FROM contract
             WHERE (contract.contract_date
                 BETWEEN '2018-01-01' AND '2019-12-31')
               AND contract.employee_id = employee.employee_id)
GROUP BY employee.employee_id
HAVING count >= 3;

/* Câu 17: Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ Platinium lên Diamond,
   chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ. **/
UPDATE customer
SET customer.typeCustomer_id = 1
WHERE customer.customer_id IN (
    SELECT csID from (
             SELECT customer.customer_id as csID
             FROM customer
                      JOIN typecustomer ON customer.typeCustomer_id = typecustomer.typeCustomer_id
                      JOIN contract ON customer.customer_id = contract.customer_id
             WHERE
                contract.contract_totalMoney > 10000000
               AND YEAR(contract.contract_date) = '2019'
    ) as Temp) AND customer.typeCustomer_id = 2;

/* Câu 19: Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi. **/


/* Câu 20: Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID
   (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi. **/
SELECT employee.employee_id       AS ID,
       employee.employee_name     AS name,
       employee.employee_email    AS email,
       employee.employee_phone    AS phone,
       employee.employee_birthday AS birthday,
       employee.employee_address  AS address
FROM employee
UNION
SELECT customer.customer_id,
       customer.customer_name,
       customer.customer_email,
       customer.customer_phone,
       customer.customer_birthday,
       customer.customer_address
FROM customer;





