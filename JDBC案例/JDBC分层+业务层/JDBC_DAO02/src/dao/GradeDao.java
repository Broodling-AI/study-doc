package dao;

import java.util.Map;

public interface GradeDao {

  /**
   * 根据年级名称删除年级信息
   * @return Map用于传递删除的结果
   */
   boolean deleteGrade(String gradeName);
   
}
