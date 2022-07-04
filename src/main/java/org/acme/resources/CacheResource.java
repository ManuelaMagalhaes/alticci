package org.acme.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.acme.services.AlticciService;
import org.acme.services.CacheService;

@Path("/cache")
public class CacheResource {
	
	@Inject
	CacheService cacheClear;

	@GET
	@Path("clear")
	@Produces("application/json")
	public Response clearCache() {
		cacheClear.clearAllCaches();
		return Response.ok("Cache Cleaned").build();
	}
	
}