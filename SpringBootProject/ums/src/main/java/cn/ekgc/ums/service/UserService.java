package cn.ekgc.ums.service;

import cn.ekgc.ums.pojo.entity.User;
import cn.ekgc.ums.pojo.vo.Page;

/**
 * <b>用户业务层接口</b>
 */
public interface UserService {
	/**
	 * <b>分页对象查询</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	Page<User> getPage(Page<User> page) throws Exception;
}
