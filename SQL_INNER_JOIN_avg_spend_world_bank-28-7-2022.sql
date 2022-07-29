CREATE TABLE IF NOT EXISTS SQL_INNER_JOIN_avg_spend_world_bank_28_7_2022 (
    `SELECT` VARCHAR(83) CHARACTER SET utf8,
    `Column_2` VARCHAR(15) CHARACTER SET utf8
);
INSERT INTO SQL_INNER_JOIN_avg_spend_world_bank_28_7_2022 VALUES
    ('    AVG(edu.value) average_value',' summary.region'),
    ('FROM ',NULL),
    ('    `bigquery-public-data.world_bank_intl_education.international_education` AS edu',NULL),
    ('INNER JOIN ',NULL),
    ('    `bigquery-public-data.world_bank_intl_education.country_summary` AS summary',NULL),
    ('ON edu.country_code = summary.country_code',NULL),
    ('WHERE summary.region IS NOT null',NULL),
    ('GROUP BY summary.region',NULL),
    ('ORDER BY average_value DESC',NULL),
    (NULL,NULL);
