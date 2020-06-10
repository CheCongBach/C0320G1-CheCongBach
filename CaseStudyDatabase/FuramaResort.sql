CREATE DATABASE caseStudy;
CREATE TABLE caseStudy.location (
    location_id int auto_increment ,
    location_name nvarchar(45) not null ,
    primary key (location_id)
);
CREATE TABLE caseStudy.level (
    level_id int auto_increment ,
    level_name nvarchar(45) not null ,
    primary key (level_id)
);
CREATE TABLE caseStudy.parts (
    parts_id int auto_increment ,
    parts_name nvarchar(45) not null ,
    primary key (parts_id)
);
CREATE TABLE caseStudy.employee (
    employee_id int auto_increment ,
    employee_name nvarchar(45) not null ,
    employee_birthday date ,
    employee_phone int unique ,
    employee_address nvarchar(45) ,
    employee_email nvarchar(45) unique ,
    employee_identityCard int unique ,
    employee_salary int not null ,
    location_id int ,
    level_id int ,
    parts_id int ,
    primary key (employee_id) ,
    foreign key (location_id) references location (location_id) ,
    foreign key (level_id) references level (level_id) ,
    foreign key (parts_id) references parts (parts_id)
);
CREATE TABLE caseStudy.typeCustomer (
    typeCustomer_id int auto_increment ,
    typeCustomer_name nvarchar(45) ,
    primary key (typeCustomer_id)
);
CREATE TABLE caseStudy.customer (
    customer_id int auto_increment ,
    customer_name nvarchar(45) not null ,
    customer_birthday date ,
    customer_identityCard int unique not null ,
    customer_phone int unique not null ,
    customer_email nvarchar(45) ,
    customer_address nvarchar(45) not null ,
    typeCustomer_id int ,
    primary key (customer_id) ,
    foreign key (typeCustomer_id) references typeCustomer (typeCustomer_id)
);
CREATE TABLE caseStudy.typeRent (
    typeRent_id int auto_increment ,
    typeRent_name nvarchar(45) ,
    typeRent_price int ,
    primary key (typeRent_id)
);
CREATE TABLE caseStudy.typeService (
    typeService_id int auto_increment ,
    typeService_name nvarchar(45) ,
    primary key (typeService_id)
);
CREATE TABLE caseStudy.service (
    service_id int auto_increment ,
    service_name nvarchar(45) ,
    service_area int not null ,
    service_numberOfFloor int not null ,
    service_maxNumber int not null ,
    service_rentalCosts int not null ,
    service_status nvarchar(45) ,
    typeRent_id int ,
    typeService_id int ,
    primary key (service_id) ,
    foreign key (typeRent_id) references typeRent (typeRent_id) ,
    foreign key (typeService_id) references typeService (typeService_id)
);
CREATE TABLE caseStudy.contract (
    contract_id int auto_increment ,
    contract_date date not null ,
    contract_end_date date not null ,
    contract_deposits int not null ,
    contract_totalMoney int ,
    employee_id int ,
    customer_id int ,
    service_id int ,
    primary key (contract_id) ,
    foreign key (employee_id) references employee (employee_id) ,
    foreign key (customer_id) references customer (customer_id) ,
    foreign key (service_id) references service (service_id)
);
CREATE TABLE caseStudy.accompaniedService (
     accompaniedService_id int auto_increment ,
     accompaniedService_name nvarchar(30) ,
     accompaniedService_unit int ,
     accompaniedService_price int ,
     primary key (accompaniedService_id)
);
CREATE TABLE caseStudy.contractDetails (
    contractDetails_id int auto_increment ,
    accompaniedService_id int ,
    contract_id int ,
    contractDetails_amount int ,
    primary key (contractDetails_id) ,
    foreign key (contract_id) references contract (contract_id) ,
    foreign key (accompaniedService_id) references accompaniedService (accompaniedService_id)
);
