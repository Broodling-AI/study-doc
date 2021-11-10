#查看默认引擎
SHOW VARIABLES LIKE ‘storage_engine%’; 

#在my.ini修改存储引擎，需修改default-storage-engine= InnoDB，重启服务后执行上面语句查看修改结果

#创建表时设置存储引擎，不设置时使用默认存储引擎
CREATE TABLE `myisam` (
   id  INT(4)
)ENGINE=MyISAM;




