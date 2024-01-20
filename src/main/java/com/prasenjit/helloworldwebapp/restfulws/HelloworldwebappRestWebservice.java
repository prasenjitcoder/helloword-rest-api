/*
* Created on Jan 17, 2024
* @author prasenjit
*/
package com.prasenjit.helloworldwebapp.restfulws;

import java.io.Serializable;

/**
 * 
 */
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/helloworld")
public class HelloworldwebappRestWebservice implements Serializable{

	private static final long serialVersionUID = 1L;

	@GET
	@Path("/sayhello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello(){
		return Response.ok("HelloWorld").build();

	}

}
