SELECT MAX(`studentResult`)  AS 最高分,
               MIN(`studentResult`) AS 最低分
FROM `result`
WHERE `subjectNo`=
    (SELECT `subjectNo` FROM `subject` 
      WHERE `subjectName`='Logic Java' ) AND `examDate`=(SELECT MAX(`examDate`) FROM `result` 
      WHERE `subjectNo`=(SELECT `subjectNo` FROM `subject` WHERE `subjectName`='Logic Java' ) );




