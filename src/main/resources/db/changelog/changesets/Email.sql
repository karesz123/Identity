CREATE TABLE email (
    email_uuid varchar(36) PRIMARY KEY NOT NULL,
    email varchar(255) NOT NULL,
    person_uuid varchar(36) FOREIGN KEY REFERENCES person(person_uuid),
    preferred bit DEFAULT 0,
    created_ts datetime NOT NULL,
    modified_ts datetime NOT NULL,
    CONSTRAINT unique_email_person_uuid UNIQUE(email, person_uuid)
)