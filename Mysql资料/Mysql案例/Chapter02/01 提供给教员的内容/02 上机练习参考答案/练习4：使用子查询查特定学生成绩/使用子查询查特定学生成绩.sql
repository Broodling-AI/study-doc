SELECT MAX(`studentResult`)  AS ��߷�,
               MIN(`studentResult`) AS ��ͷ�
FROM `result`
WHERE `subjectNo`=
    (SELECT `subjectNo` FROM `subject` 
      WHERE `subjectName`='Logic Java' ) AND `examDate`=(SELECT MAX(`examDate`) FROM `result` 
      WHERE `subjectNo`=(SELECT `subjectNo` FROM `subject` WHERE `subjectName`='Logic Java' ) );




