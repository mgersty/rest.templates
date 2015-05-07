package org.gersty.resteasy.demo.service;

import java.util.ArrayList; 
import java.util.Date; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map;

import org.springframework.stereotype.Service;
import org.gersty.resteasy.demo.domain.User;

@Service
public class UserServiceImpl implements UserService{
	
	private static Map<Integer, User> USER_MAP = new HashMap<Integer, User>();
	static
	{
		USER_MAP.put(1, new User(1, "admin", "admin@gmail.com", new Date()));
		USER_MAP.put(2, new User(2, "test", "test@gmail.com", new Date()));
		USER_MAP.put(3, new User(3, "user", "user@gmail.com", new Date()));
	}
	
	public void save(User user){
		USER_MAP.put(user.getId(), user);
		System.out.println("Saving..... "+user.toString());
		System.out.println(USER_MAP);
	}

	public User getById(Integer id){
		return USER_MAP.get(id);
	}
	
	public List<User> getAll(){
		List<User> users = new ArrayList<User>(USER_MAP.values());
		return users;
	}

	public void delete(Integer id){
		USER_MAP.remove(id);
	}
}

