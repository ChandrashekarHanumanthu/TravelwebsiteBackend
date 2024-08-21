DROP TABLE IF EXISTS destination;

DROP TABLE IF EXISTS booking;

DROP TABLE IF EXISTS contact;

CREATE TABLE IF NOT EXISTS destination (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    image_url VARCHAR(255),
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
);

CREATE TABLE IF NOT EXISTS booking (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    destination VARCHAR(255),
    date DATE,
    address VARCHAR(255),
    name VARCHAR(255),
    payment VARCHAR(255),
    transport VARCHAR(255),
    phone VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS contact (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    message TEXT
);
