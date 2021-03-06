package cn.ekgc.ums.dao;

import cn.ekgc.ums.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>用户数据接口持久层</b>
 */
@Repository
public interface UserDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> findListByQuery(User query) throws Exception;

	/**
	 * <b>添加</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer save(User entity)throws Exception;

	/**
	 * <b>修改</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer update(User entity)throws Exception;
}
