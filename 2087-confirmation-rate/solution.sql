WITH ConfirmationCounts AS (
    SELECT 
        user_id,
        COUNT(*) AS total_requests,
        SUM(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END) AS confirmed_requests
    FROM Confirmations
    GROUP BY user_id
),
AllUsers AS (
    SELECT s.user_id
    FROM Signups s
    LEFT JOIN Confirmations c ON s.user_id = c.user_id
    GROUP BY s.user_id
)
SELECT 
    u.user_id,
    ROUND(COALESCE(1.0 * confirmed_requests / total_requests, 0), 2) AS confirmation_rate
FROM AllUsers u
LEFT JOIN ConfirmationCounts cc ON u.user_id = cc.user_id;

