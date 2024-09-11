package com.project.apiteste.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.apiteste.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
	User u = new User(1L, "Bruno", "brunocloud78@gmail.com", "999999999", "400028922");
	return ResponseEntity.ok().body(u);
	}
}
