CREATE TABLE IF NOT EXISTS SQL_GOOGLE_views_example_27_7_2022 (
    `Number_of_mentions_of_Google_on_Wikipedia` VARCHAR(48) CHARACTER SET utf8,
    `Column_2` INT
);
INSERT INTO SQL_GOOGLE_views_example_27_7_2022 VALUES
    (NULL,NULL),
    ('SELECT',NULL),
    ('  language',NULL),
    ('  title',NULL),
    ('  SUM(views) AS views',NULL),
    ('FROM',NULL),
    ('  `bigquery-samples.wikipedia_benchmark.Wiki10B`',NULL),
    ('WHERE',NULL),
    ('  title LIKE ''%Google%''',NULL),
    ('GROUP BY',NULL),
    ('  language',NULL),
    ('  title',NULL),
    ('ORDER BY',NULL),
    ('  views DESC;',NULL),
    (NULL,NULL);
