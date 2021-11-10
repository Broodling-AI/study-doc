/*--关闭事务自动提交，该语句之后为事务的开始--*/
SET autocommit=0;
/*--转账:张三的账户减少500元,李四的账户增加500元--*/
UPDATE `bank` SET `currentMoney`=`currentMoney`-500 
     WHERE `customerName`='张三';
UPDATE `bank` SET `currentMoney`=`currentMoney`+500 
     WHERE `customerName`='李四';
/*--提交事务,写入硬盘,永久地保存--*/
COMMIT;
UPDATE `bank` SET `currentMoney`=`currentMoney`-1000 WHERE `customerName`='张三';
/*--回滚事务--*/
ROLLBACK;
/*--恢复自动提交--*/
SET autocommit = 1;

