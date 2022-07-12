create table counter (
    id bigserial primary key,
    value bigint not null default 0
);

insert into counter(value) values(0);