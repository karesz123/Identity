CREATE TABLE TABLE Person {
    person_uuid varchar(36) PRIMARY KEY NOT NULL,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    created_ts TIMESTAMP NOT NULL
}