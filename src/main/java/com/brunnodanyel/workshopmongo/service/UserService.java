package com.brunnodanyel.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunnodanyel.workshopmongo.domain.User;
import com.brunnodanyel.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> finAll(){
		return repo.findAll();
	}
	
}
