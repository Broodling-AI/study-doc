#数据类型宽度测试
USE test
DROP TABLE IF EXISTS `tb_type1`;
CREATE TABLE `tb_type1`(
    `sid` INT(4) ZEROFILL
);
#插入数据
INSERT INTO tb_type1 VALUES (3000000000);

#数据类型UNSIGNED属性测试
DROP TABLE IF EXISTS `tb_type2`;
CREATE TABLE `tb_type2`(
    `uid` INT(4) UNSIGNED
);

#插入数据
INSERT INTO `tb_type2` VALUE(12) ,(1234),(123456);
