USE myschool;

#如果存在result表,则删除
DROP TABLE IF EXISTS `result`;

#创建result表
CREATE TABLE `result`(
    `studentNo` INT(4) NOT NULL COMMENT '学号',
    `subjectNo` INT(4) NOT NULL COMMENT '课程编号',
    `examDate` DATETIME NOT NULL  COMMENT '考试日期',
    `studentResult` INT(4) COMMENT '考试成绩' NOT NULL
)