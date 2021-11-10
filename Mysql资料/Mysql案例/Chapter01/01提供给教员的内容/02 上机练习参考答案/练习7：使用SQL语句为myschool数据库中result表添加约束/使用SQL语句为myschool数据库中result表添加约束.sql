#创建主键：学号、课程编号和考试日期构成组合result表主键
ALTER TABLE `result` ADD PRIMARY KEY PK_result (`studentNo`,`subjectNo`,`examDate`);
#创建外键：主表student和从表result通过studentNo列建立主外键关联
ALTER TABLE `result` ADD CONSTRAINT FK_result_student FOREIGN KEY(`studentNo`) REFERENCES `student`(`studentNo`);





