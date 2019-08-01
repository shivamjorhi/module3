package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.daos.SessionDAO;
import com.cg.entities.Session;


//Session Service Implementation Class
@Service
@Transactional
public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionDAO dao;

	// find session using id
	@Transactional(readOnly = true)
	public Session findById(int id) {
		// TODO Auto-generated method stub
		Optional<Session> session = dao.findById(id);
		if (session.isPresent()) {
			return session.get();
		} else
			throw new RuntimeException("Session not found!");
	}

	// get session list
	@Transactional(readOnly = true)
	public List<Session> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	// delete session from database
	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteSession(int id) {
		// TODO Auto-generated method stub
		if (dao.existsById(id)) {
			dao.deleteById(id);
		} else {
			throw new RuntimeException("Session not found!");
		}

	}

	// update session in database
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateSession(Session s) {
		// TODO Auto-generated method stub
		Optional<Session> temp = dao.findById(s.getId());
		if (temp.isPresent()) {
			Session q = temp.get();
			q.setName(s.getName());
			q.setMode(s.getMode());
			q.setFaculty(s.getFaculty());
			q.setDuration(s.getDuration());
		} else {
			throw new RuntimeException("Session not found!");
		}
	}

	// create new session and save it in database
	@Transactional(propagation = Propagation.REQUIRED)
	public void createSession(Session s) {
		// TODO Auto-generated method stub
		if (dao.existsById(s.getId())) {
			throw new RuntimeException("Session Already exists!!");
		}
		dao.save(s);

	}

	

}
