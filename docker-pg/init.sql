CREATE USER counter WITH PASSWORD 'counter-pass';

CREATE DATABASE counter;
GRANT ALL PRIVILEGES ON DATABASE counter TO counter;

\c counter;

create table COUNTER (
    ID bigserial primary key,
    VALUE bigint not null default 0
);

insert into COUNTER(value) values (0);

GRANT ALL ON TABLE counter TO counter;
