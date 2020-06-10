create database myhomework1;
create table myhomework1.category
(
    category_id   int(20) auto_increment,
    category_name varchar(50) not null,
    primary key (category_id)
);
SELECT * FROM myhomework1.category;
