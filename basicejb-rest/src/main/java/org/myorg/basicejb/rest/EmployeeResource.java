package org.myorg.basicejb.rest;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Stateless
@Path("/employees")
public class EmployeeResource {
    
    @GET 
    @Produces("application/XML")
    public String get(){
        return "TEST123";
    }

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online 123").build();
    }
    
}