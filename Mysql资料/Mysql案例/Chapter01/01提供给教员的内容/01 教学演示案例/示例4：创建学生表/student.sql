USE myschool;
#先确定表是否存在 
DROP TABLE IF EXISTS student; 
#创建学生表
CREATE TABLE `student`(
	`studentNo` INT(4) NOT NULL COMMENT '学号',
	`loginPwd` VARCHAR(20) NOT NULL COMMENT '密码',
	`studentName` VARCHAR(50) NOT NULL COMMENT '学生姓名',
	`sex` CHAR(2) DEFAULT '男' NOT NULL  COMMENT '性别',
	`gradeId` INT(4)  UNSIGNED COMMENT '年级编号',
	`phone` VARCHAR(50)  COMMENT '联系电话',
	`address` VARCHAR(255)  COMMENT '地址',
	`bornDate` DATETIME  COMMENT '出生时间',
	`email` VARCHAR(50) COMMENT'邮件账号',
	identityCard VARCHAR(18)  COMMENT'身份证号码',
	PRIMARY KEY(`studentNo`)	
)
