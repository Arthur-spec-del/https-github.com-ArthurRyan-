CREATE TABLE SQL_LEFT_v_INNER_JOIN_28_7_2022 (
    `SELECT` VARCHAR(79) CHARACTER SET utf8,
    `Column_2` INT
);
INSERT INTO SQL_LEFT_v_INNER_JOIN_28_7_2022 VALUES
    (' seasons.market AS university',NULL),
    (' seasons.name AS team_name',NULL),
    (' seasons.wins',NULL),
    (' seasons.losses',NULL),
    (' seasons.ties',NULL),
    (' mascots.mascot AS team_mascot',NULL),
    ('FROM',NULL),
    (' `bigquery-public-data.ncaa_basketball.mbb_historical_teams_seasons` AS seasons',NULL),
    ('LEFT JOIN',NULL),
    (' `bigquery-public-data.ncaa_basketball.mascots` AS mascots',NULL),
    ('ON',NULL),
    (' seasons.team_id = mascots.id',NULL),
    ('WHERE',NULL),
    (' seasons.season = 1984',NULL),
    (' AND seasons.division = 1',NULL),
    ('ORDER BY',NULL),
    (' seasons.market',NULL),
    (NULL,NULL);
