SELECT  `studentName` ����,  
   ( SELECT `gradeName` FROM `grade` WHERE `gradeId`=`subject`.`gradeId`  ) AS �γ������꼶 , 
`subjectName` �γ�����, `examDate` ��������, `studentResult` �ɼ�
FROM  `result` r1
  INNER JOIN `student` ON r1.`studentNo`=`student`.`studentNo`
  INNER JOIN `subject` ON `subject`.`subjectNo`=r1.`subjectNo`
WHERE r1.`examDate` IN (
      SELECT MAX(`examDate`) FROM `result` r2
      WHERE r1.`subjectNo` = r2.`subjectNo`#����ѯ���Ӳ�ѯ�����ֵ��
      GROUP BY r2.`subjectNo`
) 
ORDER BY subject.gradeId;