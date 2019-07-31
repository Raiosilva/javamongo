package com.oliveira.javamongo.resouces;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oliveira.javamongo.domain.User;
import com.oliveira.javamongo.services.UserService;
import com.oliveira.javamongo.userdto.UserDTO;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list = service.findAll();
		List<UserDTO> listDto = list.stream()
				.map(x -> new UserDTO(x))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

}
