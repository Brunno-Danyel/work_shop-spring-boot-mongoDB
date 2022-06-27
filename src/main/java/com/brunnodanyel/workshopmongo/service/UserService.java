package com.brunnodanyel.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunnodanyel.workshopmongo.domain.User;
import com.brunnodanyel.workshopmongo.dto.UserDTO;
import com.brunnodanyel.workshopmongo.repository.UserRepository;
import com.brunnodanyel.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;	
	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
}