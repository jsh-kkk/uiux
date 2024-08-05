create table users(
    id varchar2(20) primary key,
    pass varchar2(20) not null,
    name varchar2(15) not null,
    phone varchar2(20) not null
);

commit;

select * from users;

drop table users;

create table person(
bunho number(10),
name varchar2(20),
ki number(10)
);

select * from person;