package com.cg.services;

import java.util.List;

import com.cg.entities.Session;


//Interface for Session related services
public interface SessionService {

	public Session findById(int id);

	public List<Session> getAll();

	public void deleteSession(int id);

	public void updateSession(Session s);

	public void createSession(Session s);

}
