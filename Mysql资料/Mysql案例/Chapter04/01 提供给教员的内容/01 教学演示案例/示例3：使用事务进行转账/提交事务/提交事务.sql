USE mybank;
/*--设置结果集以GBK编码格式显示--*/
SET NAMES gbk;
/*--开始事务(指定事务从此处开始,后续的SQL语句是一个整体--*/
BEGIN;
/*--转账:张三的账户减少500元,李四的账户增加500元--*/
UPDATE `bank` SET `currentMoney`=`currentMoney`-500 
     WHERE `customerName`='张三';
UPDATE `bank` SET `currentMoney`=`currentMoney`+500 
     WHERE `customerName`='李四';
/*--提交事务,写入硬盘,永久地保存--*/
COMMIT;


