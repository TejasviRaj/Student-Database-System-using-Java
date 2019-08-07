package com.tejasvi.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//import javax.ws.rs.Path;

import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

@Path("/student2")
public class StudentsRest {

@GET

@Produces(MediaType.TEXT_PLAIN)

public String getTestService() {

String a="Hello";
return a;

}

}

