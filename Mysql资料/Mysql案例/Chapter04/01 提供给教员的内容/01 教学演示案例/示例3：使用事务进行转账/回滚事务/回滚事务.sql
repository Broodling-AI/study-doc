/*--开始事务--*/
BEGIN;
UPDATE `bank` SET `currentMoney`=`currentMoney`+1000 WHERE `customerName`='张三';
/*--回滚事务,数据恢复到未更新前的状态--*/
ROLLBACK;


