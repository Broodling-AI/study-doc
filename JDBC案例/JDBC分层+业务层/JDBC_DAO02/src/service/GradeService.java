package service;

import java.util.Map;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface GradeService {
		
	/**
	 * 定义删除年级方法，返回删除结果
	 * @param gradeName
	 * @return
	 */
	Map<String,String> delete(String gradeName);
}
