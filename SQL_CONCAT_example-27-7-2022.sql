--SQL_CONCAT_example_27_7_2022 

SELECT
    usertype,
    CONCAT(start_station_name, " to ", end_station_name) AS route),
    COUNT(*) AS number_of_trips,
    ROUND(AVG(CAST(tripduration AS INT64) / 60) ,2) AS avg_minutes_of_trip
FROM `bigquery-public-data.new_york_citibike.citibike_trips`
GROUP BY
    start_station_name, end_station_name, usertype
ORDER BY number_of_trips DESC, avg_minutes_of_trip DESC
LIMIT 15;

