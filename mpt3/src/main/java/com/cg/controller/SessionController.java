package com.cg.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Session;
import com.cg.services.SessionService;

@RestController
public class SessionController {
	@Autowired
	private SessionService service;

	// Adding Dummy Data Into The Database
	@PostConstruct
	public String createSample() {
		Session p1 = new Session(101, "Windows ", "10 PRO","a", 8000);
		//Session p2 = new Session(102, "Ubuntu ", "18.04 Desktop","b", 7000);
		//Session p3 = new Session(103, "Linux ", "Mint 19","c", 7500);
		service.createSession(p1);
		//service.createSession(p2);
		//service.createSession(p3);
		return "Three sessions created!";
	}

	@GetMapping("/sessions") // Get mapping for getting list of sessions
	public List<Session> getAll() {
		return service.getAll();
	}

	@GetMapping(value = "/sessions-{id}") // to find session using id
	public Session findbyId(@PathVariable int id) {
		return service.findById(id);
	}

	@PostMapping(value = "/new", consumes = { "application/json" }) // to add session into the database
	public String save(@RequestBody Session p) {
		service.createSession(p);
		return "Session added!";
	}

	@PutMapping(value = "/update", consumes = { "application/json" }) // to make an update into the database using
																		// Session json
	public String update(@RequestBody Session p) {
		service.updateSession(p);
		return "session updated";
	}

	@DeleteMapping(value = "/delete{id}") // to delete session from database using id
	public String deleteUser(@PathVariable int id) {
		service.deleteSession(id);
		return "session deleted";
	}

}
