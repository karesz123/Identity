CREATE TABLE TABLE phone {
    phone_uuid varchar(36) PRIMARY KEY NOT NULL,
    phone varchar(255) NOT NULL,
    preferred bit DEFAULT 0,
    created_ts TIMESTAMP NOT NULL,
    modified_ts TIMESTAMP NOT NULL,
    CONSTRAINT fk_phone_uuid_phone FOREIGN KEY(phone_uuid, phone) REFERENCES person(person_uuid)
}