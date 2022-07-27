--SQL_GOOGLE_views_example_27_7_2022
SELECT
    language
    title
    SUM(views) AS views
FROM
    `bigquery-samples.wikipedia_benchmark.Wiki10B`
WHERE
    title LIKE ''%Google%'
GROUP BY
    language,
    title
ORDER BY
    views DESC;
