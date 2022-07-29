CREATE TABLE SQL_SUBQUERY_from_clause_28_7_2022 (
    `SELECT` VARCHAR(93) CHARACTER SET utf8,
    `Column_2` INT
);
INSERT INTO SQL_SUBQUERY_from_clause_28_7_2022 VALUES
    ('  station_id',NULL),
    ('  name',NULL),
    ('  num_of_rides AS number_of_rides_starting_at_station',NULL),
    ('FROM',NULL),
    ('  (',NULL),
    ('    SELECT',NULL),
    ('    start_station_id',NULL),
    ('    COUNT(*) num_of_rides',NULL),
    ('    FROM ',NULL),
    ('      `bigquery-public-data.new_york_citibike.citibike_trips`',NULL),
    ('      GROUP BY',NULL),
    ('        start_station_id',NULL),
    ('  ) AS station_num_trips',NULL),
    ('  INNER JOIN',NULL),
    ('  `bigquery-public-data.new_york_citibike.citibike_stations` ON station_id = start_station_id',NULL),
    ('  ORDER BY',NULL),
    ('    num_of_rides DESC',NULL),
    (NULL,NULL);
