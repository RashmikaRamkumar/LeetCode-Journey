# Write your MySQL query statement below
SELECT w1.id as id FROM Weather w1 join Weather w2 ON datediff(w1.recordDate,w2.RecordDate)=1 AND w1.temperature > w2.temperature;
