#查询S2学员考试成绩信息
SELECT `studentNo` AS 学号,`subjectNo` AS 科目编号,`studentResult` AS 成绩,`examDate` AS 考试时间 FROM `result` 
WHERE EXISTS(
SELECT * FROM `student` WHERE `gradeId` = (
    SELECT `gradeId` FROM `grade` WHERE `gradeName`='S2')
    ) AND `subjectNo` = (
    SELECT `subjectNo` FROM `subject` WHERE `gradeId` = (
    SELECT `gradeId` FROM `grade` WHERE `gradeName`='S2' ));