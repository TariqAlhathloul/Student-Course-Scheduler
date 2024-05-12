-- data base to store students information
-- id, name, birth_date, GPA
-- email, phone_number, city, zip_code
-- start_date
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    GPA DECIMAL(3, 2) NOT NULL,
    birth_date DATE NOT NULL,
    email VARCHAR(50) NOT NULL,
    phone_number VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    zip_code VARCHAR(50) NOT NULL,
    start_date DATE NOT NULL
);