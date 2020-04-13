package com.learner.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learner.model.ClassPojo;
import com.learner.model.Teacher;
import com.learner.service.ClassService;
import com.learner.service.impl.ClassServiceImpl;


@Path("/class")
public class ClassController {
	
private ClassService service=new ClassServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ClassPojo createClass(ClassPojo classpojo) {
		return service.createClass(classpojo) ;
	}

	@Path("/{id}")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ClassPojo getClassId(@PathParam("id")int id) {
				return service.getClassId(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ClassPojo> studentAllClass() {
		return service.getAllClass();
	}

	@Path("/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeClass(@PathParam("id")int id) {
		service.removeClass(id);
		
	}

	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ClassPojo updateClass(ClassPojo classpojo) {
    return service.updateClass(classpojo);
	}




}
