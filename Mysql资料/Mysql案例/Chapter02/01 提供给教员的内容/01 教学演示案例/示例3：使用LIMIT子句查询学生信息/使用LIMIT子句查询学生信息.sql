#显示前4条记录
SELECT `studentNo`,`studentName`,`phone`,`address`,`bornDate` 
FROM `student`
WHERE `gradeId` = 1
ORDER BY studentNo
LIMIT 4;

#从第1条记录开始显示，如果每页显示4条数据，要求显示第2页全部数据，经过计算，应从第5条记录开始显示4条数据
SELECT `studentNo`,`studentName`,`phone`,`address`,`bornDate` 
FROM `student`
WHERE `gradeId` = 1
ORDER BY studentNo
LIMIT 4，4;




