#使用IN子查询实现查询Logic Java成绩至少一次刚好等于60分的学生名单
SELECT `studentName` FROM `student` 
WHERE `studentNo` IN(
    SELECT `studentNo` FROM `result` 
    WHERE `subjectNo` =  (
        SELECT `subjectNo` FROM `subject`
        WHERE `subjectName`='Logic Java'
    )AND `studentResult` = 60  
);









