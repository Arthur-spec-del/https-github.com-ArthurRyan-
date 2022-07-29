
SELECT
    Orders.warehouse_id
    CONCAT(orders.state, ' : ' , orders.warehouse_alias) AS warehouse_name
    COUNT(orders.order_id) AS number_of_orders
        (SELECT
         COUNT(*)
            FROM `st-project-18-7-2022.SQL_demos.warehouse_orders.order_id` AS Orders) AS total_orders
      CASE
        WHEN COUNT(orders.order_id) / (SELECT COUNT(*) FROM warehouse_orders.order_id AS Orders) <= 0.20
        THEN "fulfilled 0-20% of Orders"
        WHEN COUNT(orders.order_id) / (SELECT COUNT(*) FROM warehouse_orders.order_id AS Orders) > 0.20
            AND COUNT(orders.order_id) / (SELECT COUNT(*) FROM warehouse_orders.order_id AS Orders) <= 0.60
        THEN "fulfilled 21-60% of Orders"
      ELSE "Fulfilled more than 60% of Orders"
      END AS fulfillment_summary
    FROM `SQL_demos.warehouse_orders` AS Warehouse
    LEFT JOIN `SQL_demos.orders` AS Orders
      ON orders.warehouse_id = warehouse_orders.warehouse_id
    GROUP BY
      warehouse_orders.warehouse_id
      warehouse_orders.warehouse_name
    HAVING
      COUNT(orders.order_id) > 0
    
