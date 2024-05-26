CREATE TABLE phone (
    phone_uuid varchar(36) PRIMARY KEY NOT NULL,
    phone varchar(255) NOT NULL,
    person_uuid varchar(36) FOREIGN KEY REFERENCES person(person_uuid),
    preferred bit DEFAULT 0,
    created_ts datetime NOT NULL,
    modified_ts datetime NOT NULL,
    CONSTRAINT unique_phone_person_uuid UNIQUE(phone, person_uuid)
)