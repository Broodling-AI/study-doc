SELECT `studentName` FROM `student` 
WHERE `studentNo` NOT IN (
      SELECT `studentNo` FROM `result` 
      WHERE `subjectNo` = (
          SELECT `subjectNo` FROM `subject` 
          WHERE `subjectName`='HTML'
       )
      AND `examDate` = (
          SELECT MAX(`examDate`) FROM `result` 
          WHERE `subjectNo` =(
              SELECT `subjectNo` FROM `subject` 
              WHERE `subjectName`='HTML' ) 
       )
)
AND `gradeId` = (
      SELECT `subjectNo` FROM `subject` 
      WHERE `subjectName`='HTML'
);