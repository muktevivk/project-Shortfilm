/**
 * 
 */
package com.shortfilim.service.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.shortfilim.dao.beans.UserDO;
import com.shortfilim.manager.CURDManager;

/**
 * @author Muktevi
 *
 */
@Component
@Path("/")
public class CURDServiceImpl {
	
	@Autowired
	private CURDManager curdManager;
	private Gson gson;

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers(){
		System.out.println("------- in getUsers()");
		List<UserDO> userDOs =  curdManager.getUsers();
		gson = new Gson();
		String results = gson.toJson(userDOs).toString();
		return Response.ok(results).build();
	}
	
	@POST
	@Path("/createUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int createUser(UserDO userDO){
		
		if (userDO == null){
			System.out.println("userDO is null");
			return 0;
		}
		return curdManager.addUser(userDO);
	}
}
