DROP TABLE IF EXISTS employee_project;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS department;

CREATE TABLE department (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE project (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    project_name VARCHAR(255)
);

CREATE TABLE employee (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    department_id BIGINT,
    FOREIGN KEY (department_id) REFERENCES department(id)
);

CREATE TABLE employee_project (
    employee_id BIGINT,
    project_id BIGINT,
    PRIMARY KEY (employee_id, project_id),
    FOREIGN KEY (employee_id) REFERENCES employee(id),
    FOREIGN KEY (project_id) REFERENCES project(id)
);
