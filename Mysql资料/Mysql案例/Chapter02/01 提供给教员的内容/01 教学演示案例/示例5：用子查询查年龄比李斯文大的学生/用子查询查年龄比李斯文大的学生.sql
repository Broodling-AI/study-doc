SELECT `studentNo`,`studentName`,`sex`,`bornDate`,`address` FROM `student` 
 WHERE `bornDate` > 
(SELECT `bornDate` FROM `student` WHERE `studentName`='李斯文');






