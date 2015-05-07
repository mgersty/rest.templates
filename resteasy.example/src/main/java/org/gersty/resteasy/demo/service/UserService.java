package org.gersty.resteasy.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gersty.resteasy.demo.domain.User;

public interface UserService {
	void save(User user);
	User getById(Integer id);
	List<User> getAll();
	void delete(Integer id);
}
