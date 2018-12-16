drop table if exists student;
create table student
(
   id integer not null auto_increment,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);