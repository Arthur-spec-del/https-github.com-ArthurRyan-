
SELECT
    employee_data.name AS department_name',
    employee_data.department_id AS department_id'
    departments.name AS employee_name'
FROM `st-project-18-7-2022.SQL_demos.employee_data` AS employee_data
INNER JOIN
`st-project-18-7-2022.SQL_demos.departments` AS departments 
ON employee_data.department_id = departments.department_id

