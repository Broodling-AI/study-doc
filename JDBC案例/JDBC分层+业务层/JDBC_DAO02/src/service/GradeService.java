package service;

import java.util.Map;

/**
 * ҵ���ӿ�
 * @author Administrator
 *
 */
public interface GradeService {
		
	/**
	 * ����ɾ���꼶����������ɾ�����
	 * @param gradeName
	 * @return
	 */
	Map<String,String> delete(String gradeName);
}
