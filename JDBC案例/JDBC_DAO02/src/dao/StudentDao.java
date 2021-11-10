package dao;

/**
 * 数据访问层 接口
 * @author Administrator
 *
 */
public interface StudentDao {
	
	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return
	 */
//	public abstract boolean login(String userName,String password);
	boolean login(String userName,String password);
	

}
