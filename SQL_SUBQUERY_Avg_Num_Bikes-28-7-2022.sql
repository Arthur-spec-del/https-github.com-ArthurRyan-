SELECT
 station_id
 name
FROM
 `bigquery-public-data.new_york_citibike.citibike_stations`
WHERE
 station_id IN
    (
    SELECT
    start_station_id
    FROM
    `bigquery-public-data.new_york_citibike.citibike_trips`
    WHERE
    usertype = "Subscriber"
    )
