create table COUNTER (
    ID bigserial primary key,
    VALUE bigint not null default 0
);

insert into COUNTER(value) values (0);