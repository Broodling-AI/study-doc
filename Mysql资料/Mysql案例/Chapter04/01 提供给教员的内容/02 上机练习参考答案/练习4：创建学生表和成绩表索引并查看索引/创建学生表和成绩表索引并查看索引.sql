USE myschool;
/*--创建学生表组合索引--*/
CREATE INDEX index_name_gradeId ON student(studentName,gradeId);
/*--创建学生表唯一索引--*/
CREATE UNIQUE INDEX index_iden ON student(identityCard);
/*--创建成绩表普通索引--*/
CREATE INDEX index_result ON result(studentResult);
