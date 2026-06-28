CREATE TABLE users
(
    id CHAR(36) PRIMARY KEY,

    first_name VARCHAR(50) NOT NULL,

    last_name VARCHAR(50) NOT NULL,

    email VARCHAR(100) NOT NULL UNIQUE,

    phone VARCHAR(10) NOT NULL UNIQUE,

    password VARCHAR(255) NOT NULL,

    gender VARCHAR(20) NOT NULL,

    date_of_birth DATE NOT NULL,

    status VARCHAR(20) NOT NULL,

    created_at TIMESTAMP NOT NULL,

    updated_at TIMESTAMP NOT NULL,

    version BIGINT DEFAULT 0
);