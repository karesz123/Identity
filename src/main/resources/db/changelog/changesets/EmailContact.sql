CREATE TABLE TABLE email {
    email_uuid varchar(36) PRIMARY KEY NOT NULL,
    email varchar(255) NOT NULL,
    preferred bit DEFAULT 0,
    created_ts TIMESTAMP NOT NULL,
    modified_ts TIMESTAMP NOT NULL,
    CONSTRAINT fk_email_uuid_email FOREIGN KEY(email_uuid, email) REFERENCES person(person_uuid)
}