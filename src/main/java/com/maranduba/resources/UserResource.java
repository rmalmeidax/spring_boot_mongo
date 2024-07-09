package com.maranduba.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maranduba.domain.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		
		User name1 = new User("1", "Maria Green", "maria@gmail.com");
		User name2 = new User("2", "Mariana Green", "mariana@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(name1,name2));
		return ResponseEntity.ok().body(list);
	}

}
