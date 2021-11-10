/*创建数据库*/
CREATE DATABASE mybank;

/*创建表*/
USE mybank;

CREATE TABLE `bank`
(
    `customerName` CHAR(10), #用户名 	
    `currentMoney` DECIMAL(10,2)  #当前余额   	
);

/*插入数据*/
INSERT INTO `bank`(`customerName`,`currentMoney`) VALUES('张三',1000);
INSERT INTO `bank`(`customerName`,`currentMoney`) VALUES('李四',1);


