SELECT  `studentName` 姓名,  
   ( SELECT `gradeName` FROM `grade` WHERE `gradeId`=`subject`.`gradeId`  ) AS 课程所属年级 , 
`subjectName` 课程名称, `examDate` 考试日期, `studentResult` 成绩
FROM  `result` r1
  INNER JOIN `student` ON r1.`studentNo`=`student`.`studentNo`
  INNER JOIN `subject` ON `subject`.`subjectNo`=r1.`subjectNo`
WHERE r1.`examDate` IN (
      SELECT MAX(`examDate`) FROM `result` r2
      WHERE r1.`subjectNo` = r2.`subjectNo`#主查询和子查询间参数值绑定
      GROUP BY r2.`subjectNo`
) 
ORDER BY subject.gradeId;