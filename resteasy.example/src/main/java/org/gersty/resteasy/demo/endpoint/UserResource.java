package org.gersty.resteasy.demo.endpoint;


import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.gersty.resteasy.demo.service.UserServiceImpl;
import org.gersty.resteasy.demo.service.UserService;
import org.gersty.resteasy.demo.domain.User;


@Component
@Path("users")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class UserResource
{
	
	@Autowired
	private UserService userService;
	
	@GET
	@Path("/")
	public Response getUsersXML(){
		List<User> users = userService.getAll();
		GenericEntity<List<User>> ge = new GenericEntity<List<User>>(users){};
		return Response.ok(ge).build();
	}
	
	@GET
	@Path("/{id}")
	public Response getUserXMLById(@PathParam("id") Integer id) {
		return Response.ok(userService.getById(id)).build();
	}
	
	@POST
	@Path("/")
	public Response saveUser(User user) {
		userService.save(user);
		return Response.ok("<status>success</status>").build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response deleteUser(@PathParam("id") Integer id) {
		userService.delete(id);
		return Response.ok("<status>success</status>").build();
	}
	
}
