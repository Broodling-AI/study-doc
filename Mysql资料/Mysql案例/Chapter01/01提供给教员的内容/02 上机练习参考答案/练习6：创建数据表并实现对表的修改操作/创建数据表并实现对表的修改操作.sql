USE test;
#创建person表
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`(
    number INT(4) AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    `sex` CHAR(2),
    bornDate DATETIME
)

#将表名修改为tb_person
ALTER TABLE `person` RENAME `tb_person`;
#删除出生日期列
ALTER TABLE `tb_person` DROP COLUMN bornDate;
#添加出生日期列，数据类型为TIME类型
ALTER TABLE `tb_person` ADD COLUMN bornDate DATE;
#修改序列号列名（number）为id，类型改为BIGINT类型
ALTER TABLE `tb_person` CHANGE `number` `id` INT(4);