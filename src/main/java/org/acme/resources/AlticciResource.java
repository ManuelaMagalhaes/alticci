package org.acme.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.acme.services.AlticciService;
import org.acme.services.CacheService;

@Path("/alticci")
public class AlticciResource {
	
	@Inject
    AlticciService service;
	
	@GET
	@Path("{n}")
	@Produces("application/json")
	public Response getAlticci(@PathParam("n") int n) {
		int response= service.getValueInIndex(Integer.valueOf(n));
		return Response.ok(response).build();
	}

}