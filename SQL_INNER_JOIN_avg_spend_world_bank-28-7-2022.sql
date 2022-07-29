
SELECT
  AVG(edu.value) AS average_value,
  summary.region
FROM
`bigquery-public-data.world_bank_intl_education.international_education` AS edu
INNER JOIN
`bigquery-public-data.world_bank_intl_education.country_summary` AS summary
    ON edu.country_code = summary.country_code
    WHERE summary.region
    GROUP BY summary.region
    ORDER BY average_value DESC
    
