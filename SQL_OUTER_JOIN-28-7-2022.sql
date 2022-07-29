CREATE TABLE IF NOT EXISTS SQL_OUTER_JOIN_28_7_2022 (
    `SELECT` VARCHAR(68) CHARACTER SET utf8,
    `Column_2` INT
);
INSERT INTO SQL_OUTER_JOIN_28_7_2022 VALUES
    ('  employee_data.name AS department_name',NULL),
    ('  employee_data.department_id AS department_id',NULL),
    ('  departments.name AS employee_name',NULL),
    ('FROM `st-project-18-7-2022.SQL_demos.employee_data` AS employee_data',NULL),
    ('FULL OUTER JOIN',NULL),
    ('  `st-project-18-7-2022.SQL_demos.departments` AS departments ON',NULL),
    ('  employee_data.department_id = departments.department_id',NULL),
    (NULL,NULL);
