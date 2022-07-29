CREATE TABLE SQL_SUBQUERY_Avg_Num_Bikes_28_7_2022 (
    `SELECT` VARCHAR(61) CHARACTER SET utf8,
    `Column_2` INT
);
INSERT INTO SQL_SUBQUERY_Avg_Num_Bikes_28_7_2022 VALUES
    ('  station_id',NULL),
    ('  name',NULL),
    ('FROM',NULL),
    ('  `bigquery-public-data.new_york_citibike.citibike_stations`',NULL),
    ('WHERE',NULL),
    ('  station_id IN',NULL),
    ('    (',NULL),
    ('    SELECT',NULL),
    ('      start_station_id',NULL),
    ('    FROM',NULL),
    ('      `bigquery-public-data.new_york_citibike.citibike_trips`',NULL),
    ('    WHERE',NULL),
    ('      usertype = "Subscriber"',NULL),
    ('    )',NULL),
    (NULL,NULL);
