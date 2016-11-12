/**
 * 
 */
package com.shortfilim.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.shortfilim.dao.beans.UserDO;

/**
 * @author Muktevi
 *
 */
@Component
public interface CURDMapper {

	public List<UserDO> getAllUsers();
	public int insertUser(UserDO userDO);
	
}
