DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    salary DOUBLE,
    date_of_joining DATE
);
