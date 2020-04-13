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

import com.learner.model.Teacher;

import com.learner.service.TeacherService;

import com.learner.service.impl.TeacherServiceImpl;


@Path("/teacher")
public class TeacherController {
	
	private TeacherService service=new TeacherServiceImpl();
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Teacher createTeacher(Teacher teacher) {
		return service.createTeacher(teacher) ;
	}

	@Path("/{id}")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Teacher getTeacherId(@PathParam("id")int id) {
				return service.getTeacherId(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Teacher> teacherAllTeacher() {
		return service.getAllTeacher();
	}

	@Path("/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeTeacher(@PathParam("id")int id) {
		service.removeTeacher(id);
		
	}


	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Teacher updateTeacher(Teacher teacher) {
    return service.updateTeacher(teacher);
	}


}
