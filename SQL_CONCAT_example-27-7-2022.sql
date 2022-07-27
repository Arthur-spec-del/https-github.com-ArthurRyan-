CREATE TABLE IF NOT EXISTS SQL_CONCAT_example_27_7_2022 (
    `CONCAT_example_New_York_City_bike_hire_data` VARCHAR(60) CHARACTER SET utf8,
    `Column_2` VARCHAR(25) CHARACTER SET utf8,
    `Column_3` VARCHAR(27) CHARACTER SET utf8,
    `Column_4` INT
);
INSERT INTO SQL_CONCAT_example_27_7_2022 VALUES
    (NULL,NULL,NULL,NULL),
    ('SELECT',NULL,NULL,NULL),
    ('  usertype',NULL,NULL,NULL),
    ('  CONCAT(start_station_name',' " to "',' end_station_name) AS route',NULL),
    ('  COUNT(*) AS number_of_trips',NULL,NULL,NULL),
    ('  ROUND(AVG(CAST(tripduration AS INT64) / 60) ','2) AS avg_minutes_of_trip',NULL,NULL),
    ('FROM `bigquery-public-data.new_york_citibike.citibike_trips`',NULL,NULL,NULL),
    ('GROUP BY',NULL,NULL,NULL),
    ('  start_station_name',' end_station_name',' usertype',NULL),
    ('ORDER BY number_of_trips DESC',' avg_minutes_of_trip DESC',NULL,NULL),
    ('LIMIT 15',NULL,NULL,NULL),
    (NULL,NULL,NULL,NULL);
