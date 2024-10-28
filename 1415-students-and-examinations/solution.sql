# Write your MySQL query statement below
WITH student_subject AS (
    SELECT s.student_id, s.student_name, subj.subject_name
    FROM Students s
    CROSS JOIN Subjects subj
)
SELECT 
    ss.student_id, 
    ss.student_name, 
    ss.subject_name, 
    COUNT(e.student_id) AS attended_exams
FROM student_subject ss
LEFT JOIN Examinations e 
    ON ss.student_id = e.student_id AND ss.subject_name = e.subject_name
GROUP BY ss.student_id, ss.student_name, ss.subject_name
ORDER BY ss.student_id, ss.subject_name;

