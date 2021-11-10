#将grade表中的gradeId设置为主键
ALTER TABLE `grade` ADD CONSTRAINT `pk_grade` PRIMARY KEY `grade`(`gradeId`);

#设置student表的gradId字段与grade表的gradeId字段建立主外键关联
ALTER TABLE `student`  ADD  CONSTRAINT fk_student_grade FOREIGN KEY(`gradeId`) REFERENCES `grade` (`gradeId`);



