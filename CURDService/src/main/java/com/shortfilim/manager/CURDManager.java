/**
 * 
 */
package com.shortfilim.manager;

import java.util.List;

import com.shortfilim.dao.beans.UserDO;

/**
 * @author Muktevi
 *
 */

public interface CURDManager {
	
	public List<UserDO> getUsers();
	public int addUser(UserDO userDO);
}
