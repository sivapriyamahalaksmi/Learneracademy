package com.learner.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learner.model.Subject;
import com.learner.service.SubjectService;
import com.learner.service.impl.SubjectServiceImpl;

@Path("/subject")
public class SubjectController {
	
	private SubjectService service=new SubjectServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Subject createSubject(Subject subject) {
		return service.createSubject(subject) ;
	}

	@Path("/{id}")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Subject getSubjectId(@PathParam("id")int id) {
		
		return service.getSubjectId(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> subjectAllSubject() {
		return service.getAllSubject();
	}

	@Path("/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeSubject(@PathParam("id")int id) {
		service.removeSubject(id);
	}


	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Subject updateSubject(Subject subject) {
	return service.updateSubject(subject);
	}


	
	
}
