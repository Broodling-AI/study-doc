#将学生表中学号为20000的学生的邮箱修改为stu20000@163.com，密码改为000
UPDATE `student` SET `email` = 'stu20000@163.com',`loginPwd` = '000' WHERE `studentName` = '20000';

#将数据表科目表中课时数大于200且年级编号为1的科目的课时减少10
UPDATE `subject` SET `classHour`=classHour-9 WHERE `classHour`>200 AND `gradeID` = 1

subject