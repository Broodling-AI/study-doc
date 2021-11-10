#查询租房信息第6~10条记录
SELECT * FROM hos_house ORDER BY hMID LIMIT 5,5;

#使用临时表保存临时的查询结果
DROP TABLE IF EXISTS tmp_table;
CREATE TEMPORARY TABLE tmp_table(
  SELECT * FROM hos_house ORDER BY hMID LIMIT 5,5
);