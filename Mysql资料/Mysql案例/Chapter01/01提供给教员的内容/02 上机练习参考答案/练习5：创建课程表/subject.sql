USE myschool;

#如果subject表已存在，则删除
DROP TABLE IF EXISTS `subject`;

#创建课程表
CREATE TABLE `subject`(
    `subjectNo` INT(4) NOT NULL AUTO_INCREMENT COMMENT '课程编号',
    `subjectName` VARCHAR(50) COMMENT '课程名称',
    `classHour` INT(4) COMMENT '学时',
    `gradeID` INT(4) COMMENT '年级编号' ,  
    PRIMARY KEY (`subjectNo`)
)COMMENT '课程表';
