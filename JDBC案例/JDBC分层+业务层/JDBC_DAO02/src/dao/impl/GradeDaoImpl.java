package dao.impl;

import java.util.Map;

import dao.BaseDao;
import dao.GradeDao;

public class GradeDaoImpl extends BaseDao implements GradeDao{
	
	@Override
	public boolean deleteGrade(String gradeName) {
		String sql="DELETE FROM grade WHERE gradeName=?";
		Object[] params={gradeName};
		if (this.executeUpdate(sql, params)>0) {
			return true;
		}else{
			return false;
		}
	}

}
