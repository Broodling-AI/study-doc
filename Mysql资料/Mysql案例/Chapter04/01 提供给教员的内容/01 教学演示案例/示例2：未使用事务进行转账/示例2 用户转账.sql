/*--转账测试:张三希望通过转账,直接汇钱给李四1000元--*/
#张三的账户少1000元,李四的账户多1000元
UPDATE bank SET currentMoney=currentMoney-1000 
     WHERE customerName='张三'
UPDATE bank SET currentMoney=currentMoney+1000 
     WHERE customerName='李四'
     
     
     
